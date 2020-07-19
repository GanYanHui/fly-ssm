package jmu.fly.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.执飞航班;
import jmu.fly.service.执飞航班Service;
import jmu.fly.service.机场管理员Service;

@Controller
@RequestMapping(value = "/apadmin")
public class 机场管理员Controller {

	@Resource(name = "机场管理员ServiceImpl")
	private 机场管理员Service 机场管理员Service;
	
	@Resource(name = "执飞航班ServiceImpl")
	private 执飞航班Service 执飞航班Service;
	
	@RequestMapping(value = "/findAll执飞航班in_6.do")
	public String findAll执飞航班in_6(Model model) {
		
		List<执飞航班> list执飞航班 = 执飞航班Service.findAll执飞航班();
		List<执飞航班> list执飞航班new = new ArrayList<执飞航班>();
		
		for (执飞航班 执飞航班 : list执飞航班) {
			String 执飞日期 = 执飞航班.get执飞日期();
			String 预计起飞时间 = 执飞航班.get预计起飞时间();
			String 预计到达时间 = 执飞航班.get预计到达时间();
			String 实际起飞时间 = 执飞航班.get实际起飞时间();
			String 实际到达时间 = 执飞航班.get实际到达时间();
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Date now = new Date();
			Date exp_start_date = null;
			Date exp_end_date = null;
			Date rea_start_date = null;
			Date rea_end_date = null;
			
			boolean flag = false;
			System.out.println(now);
			
			try {
				if(预计起飞时间 != null){
					exp_start_date = df.parse(执飞日期 + " " +预计起飞时间);
					long l1 = now.getTime() - exp_start_date.getTime();
					long hour1 = (l1/(60*60*1000)) % 24;
					System.out.println(hour1);
					if(hour1 < 6 && hour1 > -6){//满足条件,在前/后6小时内
						flag = true;
					}
					System.out.println("1.预计起飞时间: " +exp_start_date);
				}
				if(预计到达时间 != null){
					exp_end_date = df.parse(执飞日期 + " " +预计到达时间);
					long l2 = now.getTime() - exp_end_date.getTime();
					long hour2 = (l2/(60*60*1000)) % 24;
					System.out.println(hour2);
					if(hour2 < 6 && hour2 > -6){//满足条件,在前/后6小时内
						flag = true;
					}
					System.out.println("2.预计到达时间: " +exp_end_date);
				}
				if(实际起飞时间 != null){
					rea_start_date = df.parse(执飞日期 + " " +实际起飞时间);
					long l3 = now.getTime() - rea_start_date.getTime();
					long hour3 = (l3/(60*60*1000)) % 24;
					System.out.println(hour3);
					if(hour3 < 6 && hour3 > -6){//满足条件,在前/后6小时内
						flag = true;
					}
					System.out.println("3.实际起飞时间: " +rea_start_date);
				}
				if(实际到达时间 != null){
					rea_end_date = df.parse(执飞日期 + " " +实际到达时间);
					long l4 = now.getTime() - rea_end_date.getTime();
					long hour4 = (l4/(60*60*1000)) % 24;
					System.out.println(hour4);
					if(hour4 < 6 && hour4 > -6){//满足条件,在前/后6小时内
						flag = true;
					}
					System.out.println("4.实际到达时间: " +rea_end_date);
				}
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(flag){
				list执飞航班new.add(执飞航班);
				System.out.println("添加成功!!");
			}
			
		}
		model.addAttribute("list执飞航班", list执飞航班new);

		return "apadmin/all执飞航班";
	}
	
	
}
