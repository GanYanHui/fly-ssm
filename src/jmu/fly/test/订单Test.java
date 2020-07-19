package jmu.fly.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.����;
import jmu.fly.service.����Service;

public class ����Test {

	@Test
	public void find����By������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		���� ���� = ����Service.find����By������("dd1");
		System.out.println(����);
	}
	
	@Test
	public void insert����(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		���� ���� = new ����();
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		����.set������("dd1");
		����.set��¼id("user1");
		����.set�û�id("1");
		����.set��������(df.format(now));
		����.set��Ʊ��(1);
		����.set��ϵ�绰("12345678900");
		����.set���û���(100);
		����.set�ܶ�(520.0);
		����.set����״̬("����δ֧��");
		try {
			����Service.insert����(����);
			System.out.println("��������ɹ�!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("��������ʧ��!!");
		}
	}
	
	@Test
	public void find����By�û�id(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		List<����> list���� = ����Service.find����By�û�id("1");
		for (���� ���� : list����) {
			System.out.println(����);
		}
		
	}
}
