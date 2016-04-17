package com.zz.dubbo.provider;

import com.zz.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	public String SayHello(String name) {

		return "Hello," + name;

	}

}
