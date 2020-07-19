package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.候机楼;
import jmu.fly.service.候机楼Service;

public class 候机楼Test {

	@Test
	public void find候机楼By候机楼编号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		候机楼Service 候机楼Service = (候机楼Service) app.getBean("候机楼ServiceImpl");
		候机楼 hjl = 候机楼Service.find候机楼By候机楼编号("h1");
		System.out.println(hjl);
	}
	
	@Test
	public void find候机楼By机场编号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		候机楼Service 候机楼Service = (候机楼Service) app.getBean("候机楼ServiceImpl");
		List<候机楼> list候机楼 = 候机楼Service.find候机楼By机场编号("XMN");
		for (候机楼 hjl : list候机楼) {
			System.out.println(hjl);
		}
		
	}
}
