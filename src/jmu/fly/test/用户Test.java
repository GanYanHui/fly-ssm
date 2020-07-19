package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.用户;
import jmu.fly.service.用户Service;

public class 用户Test {

	@Test
	public void find用户By用户id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		用户Service 用户Service = (用户Service) app.getBean("用户ServiceImpl");
		用户 user = 用户Service.find用户By用户id("1");
		System.out.println(user);
	}
	
	@Test
	public void find用户By登录id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		用户Service 用户Service = (用户Service) app.getBean("用户ServiceImpl");
		用户 user = 用户Service.find用户By登录id("user1");
		System.out.println(user);
	}
}
