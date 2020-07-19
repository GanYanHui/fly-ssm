package jmu.fly.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.乘机人;
import jmu.fly.po.候机楼;
import jmu.fly.po.座位表;
import jmu.fly.po.执飞航班;
import jmu.fly.po.机场;
import jmu.fly.po.机票;
import jmu.fly.po.机票种类;
import jmu.fly.po.航班;
import jmu.fly.po.航线;
import jmu.fly.po.订单;
import jmu.fly.po.选座表;
import jmu.fly.service.乘机人Service;
import jmu.fly.service.候机楼Service;
import jmu.fly.service.座位表Service;
import jmu.fly.service.执飞航班Service;
import jmu.fly.service.机场Service;
import jmu.fly.service.机票Service;
import jmu.fly.service.机票种类Service;
import jmu.fly.service.用户Service;
import jmu.fly.service.航班Service;
import jmu.fly.service.航线Service;
import jmu.fly.service.订单Service;
import jmu.fly.service.选座表Service;

@Controller
public class 用户Controller {

	@Resource(name = "用户ServiceImpl")
	private 用户Service 用户Service;

	@Resource(name = "执飞航班ServiceImpl")
	private 执飞航班Service 执飞航班Service;

	@Resource(name = "机场ServiceImpl")
	private 机场Service 机场Service;

	@Resource(name = "候机楼ServiceImpl")
	private 候机楼Service 候机楼Service;

	@Resource(name = "航班ServiceImpl")
	private 航班Service 航班Service;

	@Resource(name = "航线ServiceImpl")
	private 航线Service 航线Service;

	@Resource(name = "机票种类ServiceImpl")
	private 机票种类Service 机票种类Service;
	
	@Resource(name = "乘机人ServiceImpl")
	private 乘机人Service 乘机人Service;
	
	@Resource(name = "订单ServiceImpl")
	private 订单Service 订单Service;
	
	@Resource(name = "座位表ServiceImpl")
	private 座位表Service 座位表Service;
	
	@Resource(name = "机票ServiceImpl")
	private 机票Service 机票Service;
	
	@Resource(name = "选座表ServiceImpl")
	private 选座表Service 选座表Service;

	@RequestMapping(value = "/find执飞航班By执飞日期.do")
	public String find执飞航班By执飞日期(String 日期, Model model) {
		List<执飞航班> list执飞航班 = 执飞航班Service.find执飞航班By执飞日期(日期);
		model.addAttribute("list执飞航班", list执飞航班);
		return "all执飞航班";
	}

	@RequestMapping(value = "/find执飞航班By航班编号.do")
	public String find执飞航班By航班编号(String 航班编号, Model model) {
		List<执飞航班> list执飞航班 = 执飞航班Service.find执飞航班By航班编号(航班编号);
		model.addAttribute("list执飞航班", list执飞航班);
		return "all执飞航班";
	}

	@RequestMapping(value = "/find执飞航班By机场名称.do")
	public String find执飞航班By机场名称(String 机场名称, Model model) {
		List<机场> list机场 = new ArrayList<>();
		List<候机楼> list候机楼 = new ArrayList<>();
		List<航班> list航班 = new ArrayList<>();
		List<执飞航班> list执飞航班 = new ArrayList<>();

		list机场 = 机场Service.find机场By机场名称(机场名称);
		for (机场 机场 : list机场) {
			list候机楼.addAll(候机楼Service.find候机楼By机场编号(机场.get机场编号()));
		}
		for (候机楼 候机楼 : list候机楼) {
			list航班.addAll(航班Service.find航班By候机楼编号(候机楼.get候机楼编号()));
		}
		for (航班 航班 : list航班) {
			list执飞航班.addAll(执飞航班Service.find执飞航班By航班编号(航班.get航班编号()));
		}
		
		model.addAttribute("list执飞航班", list执飞航班);
		return "all执飞航班";
	}

	@RequestMapping(value = "/find执飞航班By城市And日期.do")
	public String find执飞航班By城市And日期(String 出发城市, String 到达城市, String 执飞日期, Model model) {
		List<执飞航班> list执飞航班 = new ArrayList<>();
		航线 航线 = 航线Service.find航线By城市(出发城市, 到达城市);
		List<航班> list航班 = 航班Service.find航班By航线编号(航线.get航线编号());
		for (航班 航班 : list航班) {
			list执飞航班.add(执飞航班Service.find执飞航班By航班编号And执飞日期(航班.get航班编号(), 执飞日期));
		}
		model.addAttribute("list执飞航班", list执飞航班);
		return "all执飞航班";
	}

	@RequestMapping(value = "/find机票种类By执飞航班编号.do")
	public String find机票种类By执飞航班编号(String 执飞航班编号, Model model) {
		List<机票种类> list机票种类 = 机票种类Service.find机票种类By执飞航班编号(执飞航班编号);
		model.addAttribute("list机票种类", list机票种类);
		return "舱位选择";
	}

	@RequestMapping(value = "/prepare订单.do")
	public String prepare订单(String 舱位编号, String 执飞航班编号, Model model){
		机票种类	机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
		model.addAttribute("机票种类", 机票种类);
		return "填写订单";
	}
	
	@RequestMapping(value = "/create订单.do")
	public String create订单(String 用户_登录id, String 用户_用户id, String 执飞航班编号 ,String 舱位编号, String 乘机人姓名, String 乘机人身份证号, String 乘机人联系电话, String 乘机人性别, String 联系电话,
			Model model) {
		//创建乘机人, 绑定用户, 查找机票种类用于下个页面显示, 创建订单, 返回支付页面
		乘机人 乘机人 = new 乘机人();
		乘机人.set乘机人身份证号(乘机人身份证号);
		乘机人.set乘机人姓名(乘机人姓名);
		乘机人.set乘机人性别(乘机人性别);
		乘机人.set乘机人联系电话(乘机人联系电话);
		乘机人.set信用状态("100分");
		try {
			乘机人Service.insert乘机人(乘机人);
			System.out.println("乘机人添加成功!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("乘机人添加失败!!");
		}
		
		//此处写绑定
		
		
		机票种类	机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
		model.addAttribute("机票种类", 机票种类);
		
		订单 订单 = new 订单();
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		List<订单> list订单 = 订单Service.findAll订单();
		int num = list订单.size();
		
		订单.set订单号("dd" + (num + 1));
		订单.set登录id(用户_登录id);
		订单.set用户id(用户_用户id);
		订单.set订单日期(df.format(now));
		订单.set机票数(1);
		订单.set联系电话(联系电话);
		订单.set抵用积分(100);
		订单.set总额(520.0);
		订单.set订单状态("订单未支付");
		try {
			订单Service.insert订单(订单);
			System.out.println("订单创建成功!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("订单创建失败!!");
		}
		
		model.addAttribute("乘机人", 乘机人);
		model.addAttribute("订单", 订单);
		model.addAttribute("机票种类", 机票种类);
		
		return "支付页面";
	}
	
	@RequestMapping(value = "/findAll座位表.do")
	public String findAll座位表(String 乘机人身份证号, String 订单号, String 执飞航班编号, String 舱位编号, Model model){
		//付完钱就可以选座了,更新订单的状态信息
		订单Service.update订单(订单号, "支付成功");
		
		乘机人 乘机人 = 乘机人Service.find乘机人By乘机人身份证号(乘机人身份证号);
		订单 订单 = 订单Service.find订单By订单号(订单号);
		机票种类 机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
		List<座位表> list座位表 = 座位表Service.findAll座位表();
		
		model.addAttribute("乘机人", 乘机人);
		model.addAttribute("订单", 订单);
		model.addAttribute("机票种类", 机票种类);
		model.addAttribute("list座位表", list座位表);
		
		return "值机选座";
	}
	
	@RequestMapping(value = "/create机票.do")
	public String create机票(String 乘机人身份证号, String 订单号, String 舱位编号, String 执飞航班编号, String 座位编号, Model model){
		
		List<机票> list机票 = 机票Service.findAll机票();
		机票种类 机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
		int num = list机票.size();
		
		机票 机票 = new 机票();
		Double 机票建设费 = 100.0;
		Double 保险费 = 100.0;
		Double 机票价格 = 机票种类.get销售价格() + 机票建设费 + 保险费;
		机票.set机票编号("ticket" + (num + 1));
		机票.set乘机人身份证号(乘机人身份证号);
		System.out.println(乘机人身份证号);
		机票.set订单号(订单号);
		机票.set舱位编号(机票种类.get舱位编号());
		机票.set执飞航班编号(机票种类.get执飞航班编号());
		机票.set座位编号(Integer.valueOf(座位编号));
		机票.set机场建设费(机票建设费);
		机票.set保险费(保险费);
		机票.set机票价格(机票价格);
		机票.set备注(null);
		机票.set值机状态(null);
		机票.set登机号(null);
		
		选座表 选座表 = new 选座表();
		选座表.set座位编号(Integer.valueOf(座位编号));
		选座表.set执飞航班编号(执飞航班编号);
		选座表.set状态("已选");
		
		
		boolean flag = false;
		try {
			机票Service.insert机票(机票);
			System.out.println("出票成功!!");
			机票种类.set余票量(机票种类.get余票量() - 1);
			机票种类Service.update机票种类(机票种类);
			try {
				选座表Service.update选座表(选座表);
				System.err.println("选座表更新完成!!");
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("选座表更新失败!!");
			}
			flag = true;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("出票失败!!");
		}
		
		model.addAttribute("机票", 机票);
		model.addAttribute("flag", new Boolean(flag));
		return "出票情况";
	}
	
	@RequestMapping(value = "/find订单By用户id.do")
	public String find订单By用户id(String 用户id, Model model){
		System.out.println(用户id);
		List<订单> list订单 = 订单Service.find订单By用户id(用户id);
		model.addAttribute("list订单", list订单);
		return "我的订单";
	}
	
	@RequestMapping(value = "/find机票By订单号.do")
	public String find机票By订单号(String 订单号, Model model){
		List<机票> list机票 = 机票Service.find机票By订单号(订单号);
		订单 订单 = 订单Service.find订单By订单号(订单号);
		
		model.addAttribute("订单", 订单);
		model.addAttribute("list机票", list机票);
		return "订单+机票";
	}
	
}
