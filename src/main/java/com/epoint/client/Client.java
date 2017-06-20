package com.epoint.client;

import com.epoint.serviceimpl.HelloService;
import com.epoint.serviceimpl.HelloService_Service;

/**
 * 客户端调用 webservice
 * 
 * @author lulf
 *
 */
public class Client {
	public static void main(String[] args) {
		HelloService_Service service = new HelloService_Service();
		HelloService helloService = service.getHelloServicePort();
		String result = helloService.say("world");
		System.out.println(result);
	}
}
