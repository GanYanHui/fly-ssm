package jmu.fly.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.订单;
import jmu.fly.service.订单Service;

public class 订单Test {

	@Test
	public void find订单By订单号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		订单Service 订单Service = (订单Service) app.getBean("订单ServiceImpl");
		订单 订单 = 订单Service.find订单By订单号("dd1");
		System.out.println(订单);
	}
	
	@Test
	public void insert订单(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		订单Service 订单Service = (订单Service) app.getBean("订单ServiceImpl");
		订单 订单 = new 订单();
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		订单.set订单号("dd1");
		订单.set登录id("user1");
		订单.set用户id("1");
		订单.set订单日期(df.format(now));
		订单.set机票数(1);
		订单.set联系电话("12345678900");
		订单.set抵用积分(100);
		订单.set总额(520.0);
		订单.set订单状态("订单未支付");
		try {
			订单Service.insert订单(订单);
			System.out.println("订单插入成功!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("订单插入失败!!");
		}
	}
	
	@Test
	public void find订单By用户id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		订单Service 订单Service = (订单Service) app.getBean("订单ServiceImpl");
		List<订单> list订单 = 订单Service.find订单By用户id("1");
		for (订单 订单 : list订单) {
			System.out.println(订单);
		}
		
	}
}
