package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.����;
import jmu.fly.service.����Service;

public class ����Test {

	@Test
	public void find����By����(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		����Service ����Service = (����Service) app.getBean("����ServiceImpl");
		���� ���� = ����Service.find����By����("����", "�Ϻ�");
		System.out.println(����);
	}
}
