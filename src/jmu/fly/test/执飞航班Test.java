package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.ִ�ɺ���;
import jmu.fly.po.����;
import jmu.fly.service.ִ�ɺ���Service;

public class ִ�ɺ���Test {

	@Test
	public void findִ�ɺ���By������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ִ�ɺ���Service ִ�ɺ���Service = (ִ�ɺ���Service) app.getBean("ִ�ɺ���ServiceImpl");
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���By������("SC4941");
		for (ִ�ɺ��� zfhb : listִ�ɺ���) {
			System.out.println(zfhb);
		}
	}
	
	@Test
	public void findִ�ɺ���Byִ������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ִ�ɺ���Service ִ�ɺ���Service = (ִ�ɺ���Service) app.getBean("ִ�ɺ���ServiceImpl");
		String now = "2020-06-26";
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���Byִ������(now);
		for (ִ�ɺ��� zfhb : listִ�ɺ���) {
			System.out.println(zfhb);
		}
	}
	
	@Test
	public void findִ�ɺ���By������Andִ������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ִ�ɺ���Service ִ�ɺ���Service = (ִ�ɺ���Service) app.getBean("ִ�ɺ���ServiceImpl");
		String ������ = "SC4941";
		String ִ������ = "2020-06-26";
		ִ�ɺ��� ִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���By������Andִ������(������, ִ������);
		System.out.println(ִ�ɺ���);
	}
	
	
}
