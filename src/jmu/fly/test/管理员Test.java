package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.管理员;
import jmu.fly.service.管理员Service;

public class 管理员Test {

	@Test
	public void find管理员By登录id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		管理员Service 管理员Service = (管理员Service) app.getBean("管理员ServiceImpl");
		管理员 admin = 管理员Service.find管理员By登录id("admin1");
		System.out.println(admin);
	}
}
