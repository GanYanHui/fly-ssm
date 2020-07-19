package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.机场管理员;
import jmu.fly.service.机场管理员Service;

public class 机场管理员Test {

	@Test
	public void find机场管理员By登录id() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机场管理员Service 机场管理员Service = (机场管理员Service) app.getBean("机场管理员ServiceImpl");
		机场管理员 apAdmin = 机场管理员Service.find机场管理员By登录id("apadmin1");
		System.out.println(apAdmin);
	}
}
