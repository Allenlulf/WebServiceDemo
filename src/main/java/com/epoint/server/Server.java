package com.epoint.server;

import javax.xml.ws.Endpoint;

import com.epoint.ServiceImpl.HelloServiceImpl;
import com.epoint.service.HelloService;

/**
 * 发布WS的服务端
 * 
 * @author lulf
 *
 */
public class Server {
	public static void main(String[] args) {
		String address = "http://localhost:8080/ws/soap/hello";
		HelloService helloService = new HelloServiceImpl();
		Endpoint.publish(address, helloService);
		System.out.println("ws is published");
	}
}
