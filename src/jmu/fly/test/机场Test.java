package jmu.fly.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.机场;
import jmu.fly.service.机场Service;

public class 机场Test {

	@Test
	public void find机场By机场名称(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		机场Service 机场Service = (机场Service) app.getBean("机场ServiceImpl");
		List<机场> list机场 = 机场Service.find机场By机场名称("厦门高崎国际机场");
		for (机场 机场 : list机场) {
			System.out.println(机场);
		}
	}
}
