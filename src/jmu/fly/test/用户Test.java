package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.�û�;
import jmu.fly.service.�û�Service;

public class �û�Test {

	@Test
	public void find�û�By�û�id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		�û�Service �û�Service = (�û�Service) app.getBean("�û�ServiceImpl");
		�û� user = �û�Service.find�û�By�û�id("1");
		System.out.println(user);
	}
	
	@Test
	public void find�û�By��¼id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		�û�Service �û�Service = (�û�Service) app.getBean("�û�ServiceImpl");
		�û� user = �û�Service.find�û�By��¼id("user1");
		System.out.println(user);
	}
}
