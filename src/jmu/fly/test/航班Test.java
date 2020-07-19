package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.∫Ω∞‡;
import jmu.fly.service.∫Ω∞‡Service;

public class ∫Ω∞‡Test {

	@Test
	public void find∫Ω∞‡By∫Úª˙¬•±‡∫≈(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		∫Ω∞‡Service ∫Ω∞‡Service = (∫Ω∞‡Service) app.getBean("∫Ω∞‡ServiceImpl");
		List<∫Ω∞‡> list∫Ω∞‡ = ∫Ω∞‡Service.find∫Ω∞‡By∫Úª˙¬•±‡∫≈("h2");
		for (∫Ω∞‡ hb : list∫Ω∞‡) {
			System.out.println(hb);
		}
	}
	
	@Test
	public void insert∫Ω∞‡() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		∫Ω∞‡Service ∫Ω∞‡Service = (∫Ω∞‡Service) app.getBean("∫Ω∞‡ServiceImpl");
		∫Ω∞‡ hb = new ∫Ω∞‡();
		hb.set∫Ω∞‡±‡∫≈("SC4941");
		hb.set∫Ωœﬂ±‡∫≈("hx1");
		hb.setª˙–Õ±‡∫≈("jx1");
		hb.set≥ˆ∑¢µÿ∫Úª˙¬•±‡∫≈("h2");
		hb.setƒøµƒµÿ∫Úª˙¬•±‡∫≈("h3");
		String start = "08:00:00";
		String end = "10:00:00";
		hb.setº∆ªÆ∆∑… ±º‰(start);
		hb.setº∆ªÆµΩ¥Ô ±º‰(end);
		try {
			∫Ω∞‡Service.insert∫Ω∞‡(hb);
			System.out.println("≤Â»Î∫Ω∞‡≥…π¶!");
		} catch (Exception e) {
			System.out.println("≤Â»Î∫Ω∞‡ ß∞‹!");
		}
	}
	
	@Test
	public void delete∫Ω∞‡By∫Ω∞‡±‡∫≈() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		∫Ω∞‡Service ∫Ω∞‡Service = (∫Ω∞‡Service) app.getBean("∫Ω∞‡ServiceImpl");
		try {
			∫Ω∞‡Service.delete∫Ω∞‡By∫Ω∞‡±‡∫≈("SC4941");
			System.out.println("…æ≥˝∫Ω∞‡≥…π¶!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("…æ≥˝∫Ω∞‡ ß∞‹!");
		}
	}
}
