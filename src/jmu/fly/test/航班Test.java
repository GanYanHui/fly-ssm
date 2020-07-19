package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.����;
import jmu.fly.service.����Service;

public class ����Test {

	@Test
	public void find����By���¥���(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		List<����> list���� = ����Service.find����By���¥���("h2");
		for (���� hb : list����) {
			System.out.println(hb);
		}
	}
	
	@Test
	public void insert����() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		���� hb = new ����();
		hb.set������("SC4941");
		hb.set���߱��("hx1");
		hb.set���ͱ��("jx1");
		hb.set�����غ��¥���("h2");
		hb.setĿ�ĵغ��¥���("h3");
		String start = "08:00:00";
		String end = "10:00:00";
		hb.set�ƻ����ʱ��(start);
		hb.set�ƻ�����ʱ��(end);
		try {
			����Service.insert����(hb);
			System.out.println("���뺽��ɹ�!");
		} catch (Exception e) {
			System.out.println("���뺽��ʧ��!");
		}
	}
	
	@Test
	public void delete����By������() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		try {
			����Service.delete����By������("SC4941");
			System.out.println("ɾ������ɹ�!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("ɾ������ʧ��!");
		}
	}
}
