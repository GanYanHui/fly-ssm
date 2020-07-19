package jmu.fly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.fly.po.乘机人;
import jmu.fly.service.乘机人Service;

public class 乘机人Test {

	@Test
	public void find乘机人By乘机人身份证号(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		乘机人Service 乘机人Service = (乘机人Service) app.getBean("乘机人ServiceImpl");
		乘机人 乘机人 = 乘机人Service.find乘机人By乘机人身份证号("350681199909226514");
		System.out.println(乘机人);
	}
	
	@Test
	public void insert乘机人(){
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		乘机人Service 乘机人Service = (乘机人Service) app.getBean("乘机人ServiceImpl");
		乘机人 乘机人 = new 乘机人();
		乘机人.set乘机人身份证号("350681199909226514");
		乘机人.set乘机人姓名("张三");
		乘机人.set乘机人性别("男");
		乘机人.set乘机人联系电话("12345678900");
		乘机人.set信用状态("100分");
		try {
			乘机人Service.insert乘机人(乘机人);
			System.out.println("插入乘机人成功!");
		} catch (Exception e) {
			System.out.println("插入乘机人失败!");
		}
	}
}
