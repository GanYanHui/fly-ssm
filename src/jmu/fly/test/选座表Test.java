package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.ѡ����;
import jmu.fly.service.ѡ����Service;

public class ѡ����Test {

	@Test
	public void findAllѡ����(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ѡ����Service ѡ����Service = (ѡ����Service) app.getBean("ѡ����ServiceImpl");
		List<ѡ����> listѡ���� = ѡ����Service.findAllѡ����();
		for (ѡ���� ѡ���� : listѡ����) {
			System.out.println(ѡ����);
		}
	}
}
