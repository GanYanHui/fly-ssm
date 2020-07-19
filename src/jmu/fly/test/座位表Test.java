package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.座位表;
import jmu.fly.service.座位表Service;

public class 座位表Test {

	@Test
	public void findAll座位表(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		座位表Service 座位表Service = (座位表Service) app.getBean("座位表ServiceImpl");
		List<座位表> list座位表 = 座位表Service.findAll座位表();
		for (座位表 座位表 : list座位表) {
			System.out.println(座位表);
		}
	}
}
