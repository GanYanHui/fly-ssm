package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.机票;
import jmu.fly.service.机票Service;

public class 机票Test {

	@Test
	public void findAll机票() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票Service 机票Service = (机票Service) app.getBean("机票ServiceImpl");
		List<机票> list机票 = 机票Service.findAll机票();
		for (机票 机票 : list机票) {
			System.out.println(机票);
		}
	}

	@Test
	public void find机票By执飞航班编号() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票Service 机票Service = (机票Service) app.getBean("机票ServiceImpl");
		List<机票> list机票 = 机票Service.find机票By执飞航班编号("zf1");
		for (机票 机票 : list机票) {
			System.out.println(机票);
		}
	}

	@Test
	public void insert机票() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票Service 机票Service = (机票Service) app.getBean("机票ServiceImpl");
		机票 机票 = new 机票();
		Double 机票建设费 = 100.0;
		Double 保险费 = 100.0;
		Double 机票价格 = 520 + 机票建设费 + 保险费;
		机票.set机票编号("ticket" + 1);
		机票.set乘机人身份证号("350681199909226514");
		机票.set订单号("dd1");
		机票.set舱位编号("cw1");
		机票.set执飞航班编号("zf2");
		机票.set座位编号(1);
		机票.set机场建设费(机票建设费);
		机票.set保险费(保险费);
		机票.set机票价格(机票价格);
		机票.set备注(null);
		机票.set值机状态(null);
		机票.set登机号(null);
		try {
			机票Service.insert机票(机票);
			System.out.println("出票成功!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("出票失败!!");
		}
	}
	
	@Test
	public void find机票By订单号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票Service 机票Service = (机票Service) app.getBean("机票ServiceImpl");
		List<机票> list机票 = 机票Service.find机票By订单号("dd1");
		for (机票 机票 : list机票) {
			System.out.println(机票);
		}
	}
}
