package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.��������Ա;
import jmu.fly.service.��������ԱService;

public class ��������ԱTest {

	@Test
	public void find��������ԱBy��¼id() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��������ԱService ��������ԱService = (��������ԱService) app.getBean("��������ԱServiceImpl");
		��������Ա apAdmin = ��������ԱService.find��������ԱBy��¼id("apadmin1");
		System.out.println(apAdmin);
	}
}
