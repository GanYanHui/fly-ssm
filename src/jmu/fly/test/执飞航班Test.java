package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.÷¥∑…∫Ω∞‡;
import jmu.fly.po.∫Ω∞‡;
import jmu.fly.service.÷¥∑…∫Ω∞‡Service;

public class ÷¥∑…∫Ω∞‡Test {

	@Test
	public void find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		÷¥∑…∫Ω∞‡Service ÷¥∑…∫Ω∞‡Service = (÷¥∑…∫Ω∞‡Service) app.getBean("÷¥∑…∫Ω∞‡ServiceImpl");
		List<÷¥∑…∫Ω∞‡> list÷¥∑…∫Ω∞‡ = ÷¥∑…∫Ω∞‡Service.find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈("SC4941");
		for (÷¥∑…∫Ω∞‡ zfhb : list÷¥∑…∫Ω∞‡) {
			System.out.println(zfhb);
		}
	}
	
	@Test
	public void find÷¥∑…∫Ω∞‡By÷¥∑…»’∆⁄(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		÷¥∑…∫Ω∞‡Service ÷¥∑…∫Ω∞‡Service = (÷¥∑…∫Ω∞‡Service) app.getBean("÷¥∑…∫Ω∞‡ServiceImpl");
		String now = "2020-06-26";
		List<÷¥∑…∫Ω∞‡> list÷¥∑…∫Ω∞‡ = ÷¥∑…∫Ω∞‡Service.find÷¥∑…∫Ω∞‡By÷¥∑…»’∆⁄(now);
		for (÷¥∑…∫Ω∞‡ zfhb : list÷¥∑…∫Ω∞‡) {
			System.out.println(zfhb);
		}
	}
	
	@Test
	public void find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈And÷¥∑…»’∆⁄(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		÷¥∑…∫Ω∞‡Service ÷¥∑…∫Ω∞‡Service = (÷¥∑…∫Ω∞‡Service) app.getBean("÷¥∑…∫Ω∞‡ServiceImpl");
		String ∫Ω∞‡±‡∫≈ = "SC4941";
		String ÷¥∑…»’∆⁄ = "2020-06-26";
		÷¥∑…∫Ω∞‡ ÷¥∑…∫Ω∞‡ = ÷¥∑…∫Ω∞‡Service.find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈And÷¥∑…»’∆⁄(∫Ω∞‡±‡∫≈, ÷¥∑…»’∆⁄);
		System.out.println(÷¥∑…∫Ω∞‡);
	}
	
	
}
