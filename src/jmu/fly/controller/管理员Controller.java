package jmu.fly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.候机楼;
import jmu.fly.po.执飞航班;
import jmu.fly.po.机型;
import jmu.fly.po.机票种类;
import jmu.fly.po.航班;
import jmu.fly.po.航线;
import jmu.fly.po.舱位;
import jmu.fly.service.候机楼Service;
import jmu.fly.service.执飞航班Service;
import jmu.fly.service.机型Service;
import jmu.fly.service.机票种类Service;
import jmu.fly.service.管理员Service;
import jmu.fly.service.航班Service;
import jmu.fly.service.航线Service;
import jmu.fly.service.舱位Service;

@Controller
@RequestMapping(value = "/admin")
public class 管理员Controller {

	@Resource(name = "管理员ServiceImpl")
	private 管理员Service 管理员Service;

	@Resource(name = "航班ServiceImpl")
	private 航班Service 航班Service;

	@Resource(name = "执飞航班ServiceImpl")
	private 执飞航班Service 执飞航班Service;

	@Resource(name = "机票种类ServiceImpl")
	private 机票种类Service 机票种类Service;

	@Resource(name = "航线ServiceImpl")
	private 航线Service 航线Service;

	@Resource(name = "机型ServiceImpl")
	private 机型Service 机型Service;

	@Resource(name = "候机楼ServiceImpl")
	private 候机楼Service 候机楼Service;

	@Resource(name = "舱位ServiceImpl")
	private 舱位Service 舱位Service;

	@RequestMapping(value = "/findAll航班.do")
	public String findAll航班(Model model) {
		
		List<航班> list航班 = 航班Service.findAll航班();

		model.addAttribute("list航班", list航班);

		return "admin/all航班";
	}

	@RequestMapping(value = "/findAll执飞航班.do")
	public String findAll执飞航班(Model model) {
		
		List<执飞航班> list执飞航班 = 执飞航班Service.findAll执飞航班();

		model.addAttribute("list执飞航班", list执飞航班);

		return "admin/all执飞航班";
	}

	@RequestMapping(value = "/findAll机票种类.do")
	public String findAll机票种类(Model model) {
		
		List<机票种类> list机票种类 = 机票种类Service.findAll机票种类();

		model.addAttribute("list机票种类", list机票种类);

		return "admin/all机票种类";
	}

	@RequestMapping(value = "/find航班By航班编号.do")
	public String find航班By航班编号(String 航班编号, Model model) {
		
		航班 航班 = 航班Service.find航班By航班编号(航班编号);
		List<航线> list航线 = 航线Service.findAll航线();
		List<机型> list机型 = 机型Service.findAll机型();
		List<候机楼> list候机楼 = 候机楼Service.findAll候机楼();

		model.addAttribute("航班", 航班);
		model.addAttribute("list航线", list航线);
		model.addAttribute("list机型", list机型);
		model.addAttribute("list候机楼", list候机楼);

		return "admin/update航班";
	}

	@RequestMapping(value = "/find执飞航班By执飞航班编号.do")
	public String find执飞航班By执飞航班编号(String 执飞航班编号, Model model) {
		
		执飞航班 执飞航班 = 执飞航班Service.find执飞航班By执飞航班编号(执飞航班编号);
		List<航班> list航班 = 航班Service.findAll航班();

		model.addAttribute("执飞航班", 执飞航班);
		model.addAttribute("list航班", list航班);
		
		return "admin/update执飞航班";
	}

	@RequestMapping(value = "/find机票种类By执飞航班编号And舱位编号.do")
	public String find机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号, Model model) {
		机票种类 机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
		
		List<舱位> list舱位 = 舱位Service.findAll舱位();
		List<执飞航班> list执飞航班 = 执飞航班Service.findAll执飞航班();

		model.addAttribute("机票种类", 机票种类);
		model.addAttribute("list舱位", list舱位);
		model.addAttribute("list执飞航班", list执飞航班);

		return "admin/update机票种类";
	}

	@RequestMapping(value = "/update航班.do")
	public String update航班(String 航班编号, String 航线编号, String 机型编号, String 出发地候机楼编号, String 目的地候机楼编号, String 计划起飞时间,
			String 计划到达时间, Model model) {

		航班 航班 = new 航班();
		航班.set航班编号(航班编号);
		航班.set航线编号(航线编号);
		航班.set机型编号(机型编号);
		航班.set出发地候机楼编号(出发地候机楼编号);
		航班.set目的地候机楼编号(目的地候机楼编号);
		航班.set计划起飞时间(计划起飞时间);
		航班.set计划到达时间(计划到达时间);
		boolean flag = false;
		try {
			航班Service.update航班(航班);
			flag = true;
			System.out.println("更新完成!");
		} catch (Exception e) {
			System.out.println("更新失败!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/update航班_do";
	}

	@RequestMapping(value = "/update执飞航班.do")
	public String update执飞航班(String 执飞航班编号, String 航班编号, String 执飞日期, Double 执行价格, String 预计起飞时间, String 预计到达时间,
			String 实际起飞时间, String 实际到达时间, String 状态, String 登机口, String 登机时间, Model model) {

		执飞航班 执飞航班 = new 执飞航班();
		执飞航班.set执飞航班编号(执飞航班编号);
		执飞航班.set航班编号(航班编号);
		执飞航班.set执飞日期(执飞日期);
		执飞航班.set执行价格(执行价格);
		执飞航班.set预计起飞时间(预计起飞时间);
		执飞航班.set预计到达时间(预计到达时间);
		执飞航班.set实际起飞时间(实际起飞时间);
		执飞航班.set实际到达时间(实际到达时间);
		执飞航班.set状态(状态);
		执飞航班.set登机口(登机口);
		执飞航班.set登机时间(登机时间);
		boolean flag = false;
		try {
			执飞航班Service.update执飞航班(执飞航班);
			flag = true;
			System.out.println("更新完成!");
		} catch (Exception e) {
			System.out.println("更新失败!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/update执飞航班_do";
	}

	@RequestMapping(value = "/update机票种类.do")
	public String update机票种类(String 舱位编号, String 执飞航班编号, Double 销售价格, String 有效起始日期, String 有效截至日期, Double 折扣, int 余票量,
			int 行李额度, int 行李件数, String 餐食状态, String 退改签规则, Model model) {

		机票种类 机票种类 = new 机票种类();
		机票种类.set舱位编号(舱位编号);
		机票种类.set执飞航班编号(执飞航班编号);
		机票种类.set销售价格(销售价格);
		机票种类.set有效起始日期(有效起始日期);
		机票种类.set有效截至日期(有效截至日期);
		机票种类.set折扣(折扣);
		机票种类.set余票量(余票量);
		机票种类.set行李额度(行李额度);
		机票种类.set行李件数(行李件数);
		机票种类.set餐食状态(餐食状态);
		机票种类.set退改签规则(退改签规则);
		boolean flag = false;
		try {
			机票种类Service.update机票种类(机票种类);
			flag = true;
			System.out.println("更新完成!");
		} catch (Exception e) {
			System.out.println("更新失败!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/update机票种类_do";
	}

	@RequestMapping(value = "/beforeInsert航班.do")
	public String beforeInsert航班(Model model) {
		
		List<航线> list航线 = 航线Service.findAll航线();
		List<机型> list机型 = 机型Service.findAll机型();
		List<候机楼> list候机楼 = 候机楼Service.findAll候机楼();

		model.addAttribute("list航线", list航线);
		model.addAttribute("list机型", list机型);
		model.addAttribute("list候机楼", list候机楼);

		return "admin/insert航班";
	}

	@RequestMapping(value = "/beforeInsert执飞航班.do")
	public String beforeInsert执飞航班(Model model) {
		
		List<航班> list航班 = 航班Service.findAll航班();

		model.addAttribute("list航班", list航班);

		return "admin/insert执飞航班";
	}

	@RequestMapping(value = "/beforeInsert机票种类.do")
	public String beforeInsert机票种类(Model model) {
		
		List<舱位> list舱位 = 舱位Service.findAll舱位();
		List<执飞航班> list执飞航班 = 执飞航班Service.findAll执飞航班();
		
		System.out.println(list舱位);
		System.out.println(list执飞航班);
		System.err.println("OK!");

		model.addAttribute("list舱位", list舱位);
		model.addAttribute("list执飞航班", list执飞航班);

		return "admin/insert机票种类";
	}

	@RequestMapping(value = "/insert航班.do")
	public String insert航班(String 航班编号, String 航线编号, String 机型编号, String 出发地候机楼编号, String 目的地候机楼编号, String 计划起飞时间,
			String 计划到达时间, Model model) {
		
		航班 航班 = new 航班();
		航班.set航班编号(航班编号);
		航班.set航线编号(航线编号);
		航班.set机型编号(机型编号);
		航班.set出发地候机楼编号(出发地候机楼编号);
		航班.set目的地候机楼编号(目的地候机楼编号);
		航班.set计划起飞时间(计划起飞时间);
		航班.set计划到达时间(计划到达时间);
		boolean flag = false;
		try {
			航班Service.insert航班(航班);
			flag = true;
			System.out.println("插入航班成功!!");
		} catch (Exception e) {
			System.out.println("插入航班失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/insert航班_do";
	}

	@RequestMapping(value = "/insert执飞航班.do")
	public String insert执飞航班(String 航班编号, String 执飞日期, Double 执行价格, String 预计起飞时间, String 预计到达时间, String 实际起飞时间,
			String 实际到达时间, String 状态, String 登机口, String 登机时间, Model model) {
		
		List<执飞航班> list执飞航班 = 执飞航班Service.findAll执飞航班();
		int num = list执飞航班.size();
		
		执飞航班 执飞航班 = new 执飞航班();
		
		执飞航班.set执飞航班编号("zf" + (num + 1));
		执飞航班.set航班编号(航班编号);
		执飞航班.set执飞日期(执飞日期);
		执飞航班.set执行价格(执行价格);
		执飞航班.set预计起飞时间(预计起飞时间);
		执飞航班.set预计到达时间(预计到达时间);
		执飞航班.set实际起飞时间(实际起飞时间);
		执飞航班.set实际到达时间(实际到达时间);
		执飞航班.set状态(状态);
		执飞航班.set登机口(登机口);
		执飞航班.set登机时间(登机时间);
		boolean flag = false;
		try {
			执飞航班Service.insert执飞航班(执飞航班);
			flag = true;
			System.out.println("插入执飞航班成功!!");
		} catch (Exception e) {
			System.out.println("插入执飞航班失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/insert执飞航班_do";
	}

	@RequestMapping(value = "/insert机票种类.do")
	public String insert机票种类(String 舱位编号, String 执飞航班编号, Double 销售价格, String 有效起始日期, String 有效截至日期, Double 折扣,
			int 余票量, int 行李额度, int 行李件数, String 餐食状态, String 退改签规则, Model model) {
		
		机票种类 机票种类 = new 机票种类();
		
		机票种类.set舱位编号(舱位编号);
		机票种类.set执飞航班编号(执飞航班编号);
		机票种类.set销售价格(销售价格);
		机票种类.set有效起始日期(有效起始日期);
		机票种类.set有效截至日期(有效截至日期);
		机票种类.set折扣(折扣);
		机票种类.set余票量(余票量);
		机票种类.set行李件数(行李件数);
		机票种类.set行李额度(行李额度);
		机票种类.set餐食状态(餐食状态);
		机票种类.set退改签规则(退改签规则);
		boolean flag = false;
		try {
			机票种类Service.insert机票种类(机票种类);
			flag = true;
			System.out.println("插入机票种类成功!!");
		} catch (Exception e) {
			System.out.println("插入机票种类失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/insert机票种类_do";
	}

	@RequestMapping(value = "/delete航班By航班编号.do")
	public String delete航班By航班编号(String 航班编号, Model model) {
		
		boolean flag = false;
		try {
			航班Service.delete航班By航班编号(航班编号);
			flag = true;
			System.out.println("删除航班成功!!");
		} catch (Exception e) {
			System.out.println("删除航班失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/delete航班";
	}

	@RequestMapping(value = "/delete执飞航班By执飞航班编号.do")
	public String delete执飞航班By执飞航班编号(String 执飞航班编号, Model model) {
		
		boolean flag = false;
		try {
			执飞航班Service.delete执飞航班By执飞航班编号(执飞航班编号);
			flag = true;
			System.out.println("删除执飞航班成功!!");
		} catch (Exception e) {
			System.out.println("删除执飞航班失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/delete执飞航班";
	}
	
	@RequestMapping(value = "/delete机票种类By执飞航班编号And舱位编号.do")
	public String delete机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号, Model model) {
		
		boolean flag = false;
		try {
			机票种类Service.delete机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
			flag = true;
			System.out.println("删除机票种类成功!!");
		} catch (Exception e) {
			System.out.println("删除机票种类失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/delete机票种类";
	}
	
	@RequestMapping(value = "/find航班ByLike.do")
	public String find航班ByLike(String string, Model model){
		
		List<航班> list航班 = 航班Service.find航班ByLike(string);

		model.addAttribute("list航班", list航班);
		model.addAttribute("string", string);

		return "admin/all航班";
	}

}
