package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.��λ��;
import jmu.fly.service.��λ��Service;

public class ��λ��Test {

	@Test
	public void findAll��λ��(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��λ��Service ��λ��Service = (��λ��Service) app.getBean("��λ��ServiceImpl");
		List<��λ��> list��λ�� = ��λ��Service.findAll��λ��();
		for (��λ�� ��λ�� : list��λ��) {
			System.out.println(��λ��);
		}
	}
}
