package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.�˻���;
import jmu.fly.service.�˻���Service;

public class �˻���Test {

	@Test
	public void find�˻���By�˻������֤��(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		�˻���Service �˻���Service = (�˻���Service) app.getBean("�˻���ServiceImpl");
		�˻��� �˻��� = �˻���Service.find�˻���By�˻������֤��("350681199909226514");
		System.out.println(�˻���);
	}
	
	@Test
	public void insert�˻���(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		�˻���Service �˻���Service = (�˻���Service) app.getBean("�˻���ServiceImpl");
		�˻��� �˻��� = new �˻���();
		�˻���.set�˻������֤��("350681199909226514");
		�˻���.set�˻�������("����");
		�˻���.set�˻����Ա�("��");
		�˻���.set�˻�����ϵ�绰("12345678900");
		�˻���.set����״̬("100��");
		try {
			�˻���Service.insert�˻���(�˻���);
			System.out.println("����˻��˳ɹ�!");
		} catch (Exception e) {
			System.out.println("����˻���ʧ��!");
		}
	}
}
