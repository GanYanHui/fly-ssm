package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.��Ʊ����;
import jmu.fly.service.��Ʊ����Service;

public class ��Ʊ����Test {

	@Test
	public void find��Ʊ����Byִ�ɺ�����(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��Ʊ����Service ��Ʊ����Service = (��Ʊ����Service) app.getBean("��Ʊ����ServiceImpl");
		List<��Ʊ����> list��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����("zf2");
		for (��Ʊ���� ��Ʊ���� : list��Ʊ����) {
			System.out.println(��Ʊ����);
		}
	}
	
	@Test
	public void find��Ʊ����Byִ�ɺ�����And��λ���(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��Ʊ����Service ��Ʊ����Service = (��Ʊ����Service) app.getBean("��Ʊ����ServiceImpl");
		��Ʊ���� ��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���("zf2", "cw1");
		System.out.println(��Ʊ����);
	}
	
}
