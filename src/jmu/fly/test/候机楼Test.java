package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.���¥;
import jmu.fly.service.���¥Service;

public class ���¥Test {

	@Test
	public void find���¥By���¥���(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		���¥Service ���¥Service = (���¥Service) app.getBean("���¥ServiceImpl");
		���¥ hjl = ���¥Service.find���¥By���¥���("h1");
		System.out.println(hjl);
	}
	
	@Test
	public void find���¥By�������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		���¥Service ���¥Service = (���¥Service) app.getBean("���¥ServiceImpl");
		List<���¥> list���¥ = ���¥Service.find���¥By�������("XMN");
		for (���¥ hjl : list���¥) {
			System.out.println(hjl);
		}
		
	}
}
