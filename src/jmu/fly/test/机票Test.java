package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.��Ʊ;
import jmu.fly.service.��ƱService;

public class ��ƱTest {

	@Test
	public void findAll��Ʊ() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��ƱService ��ƱService = (��ƱService) app.getBean("��ƱServiceImpl");
		List<��Ʊ> list��Ʊ = ��ƱService.findAll��Ʊ();
		for (��Ʊ ��Ʊ : list��Ʊ) {
			System.out.println(��Ʊ);
		}
	}

	@Test
	public void find��ƱByִ�ɺ�����() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��ƱService ��ƱService = (��ƱService) app.getBean("��ƱServiceImpl");
		List<��Ʊ> list��Ʊ = ��ƱService.find��ƱByִ�ɺ�����("zf1");
		for (��Ʊ ��Ʊ : list��Ʊ) {
			System.out.println(��Ʊ);
		}
	}

	@Test
	public void insert��Ʊ() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��ƱService ��ƱService = (��ƱService) app.getBean("��ƱServiceImpl");
		��Ʊ ��Ʊ = new ��Ʊ();
		Double ��Ʊ����� = 100.0;
		Double ���շ� = 100.0;
		Double ��Ʊ�۸� = 520 + ��Ʊ����� + ���շ�;
		��Ʊ.set��Ʊ���("ticket" + 1);
		��Ʊ.set�˻������֤��("350681199909226514");
		��Ʊ.set������("dd1");
		��Ʊ.set��λ���("cw1");
		��Ʊ.setִ�ɺ�����("zf2");
		��Ʊ.set��λ���(1);
		��Ʊ.set���������(��Ʊ�����);
		��Ʊ.set���շ�(���շ�);
		��Ʊ.set��Ʊ�۸�(��Ʊ�۸�);
		��Ʊ.set��ע(null);
		��Ʊ.setֵ��״̬(null);
		��Ʊ.set�ǻ���(null);
		try {
			��ƱService.insert��Ʊ(��Ʊ);
			System.out.println("��Ʊ�ɹ�!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("��Ʊʧ��!!");
		}
	}
	
	@Test
	public void find��ƱBy������(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		��ƱService ��ƱService = (��ƱService) app.getBean("��ƱServiceImpl");
		List<��Ʊ> list��Ʊ = ��ƱService.find��ƱBy������("dd1");
		for (��Ʊ ��Ʊ : list��Ʊ) {
			System.out.println(��Ʊ);
		}
	}
}
