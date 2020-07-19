package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.航线;
import jmu.fly.service.航线Service;

public class 航线Test {

	@Test
	public void find航线By城市(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		航线Service 航线Service = (航线Service) app.getBean("航线ServiceImpl");
		航线 航线 = 航线Service.find航线By城市("厦门", "上海");
		System.out.println(航线);
	}
}
