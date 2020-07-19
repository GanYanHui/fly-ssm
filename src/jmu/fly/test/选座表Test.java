package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.选座表;
import jmu.fly.service.选座表Service;

public class 选座表Test {

	@Test
	public void findAll选座表(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		选座表Service 选座表Service = (选座表Service) app.getBean("选座表ServiceImpl");
		List<选座表> list选座表 = 选座表Service.findAll选座表();
		for (选座表 选座表 : list选座表) {
			System.out.println(选座表);
		}
	}
}
