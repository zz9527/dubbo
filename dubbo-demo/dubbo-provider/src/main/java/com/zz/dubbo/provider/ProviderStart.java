package com.zz.dubbo.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderStart {

	private static volatile boolean running = true;

	public static void main(String[] args) {

/*		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		context.start();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		while (running) {
			synchronized (ProviderStart.class) {
				try {
					ProviderStart.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}

		}
	}
}
