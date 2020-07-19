package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.机票种类;
import jmu.fly.service.机票种类Service;

public class 机票种类Test {

	@Test
	public void find机票种类By执飞航班编号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票种类Service 机票种类Service = (机票种类Service) app.getBean("机票种类ServiceImpl");
		List<机票种类> list机票种类 = 机票种类Service.find机票种类By执飞航班编号("zf2");
		for (机票种类 机票种类 : list机票种类) {
			System.out.println(机票种类);
		}
	}
	
	@Test
	public void find机票种类By执飞航班编号And舱位编号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机票种类Service 机票种类Service = (机票种类Service) app.getBean("机票种类ServiceImpl");
		机票种类 机票种类 = 机票种类Service.find机票种类By执飞航班编号And舱位编号("zf2", "cw1");
		System.out.println(机票种类);
	}
	
}
