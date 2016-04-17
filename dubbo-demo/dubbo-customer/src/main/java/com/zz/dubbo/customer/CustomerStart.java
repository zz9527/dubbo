package com.zz.dubbo.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zz.dubbo.demo.DemoService;

public class CustomerStart {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		while (true) {
			DemoService service = (DemoService) context.getBean("demoService");
			System.out.println(service.SayHello("Dubbo!!!"));
		}

	}
}
