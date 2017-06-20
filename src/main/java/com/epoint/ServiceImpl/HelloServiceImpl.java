package com.epoint.ServiceImpl;

import javax.jws.WebService;

import com.epoint.service.HelloService;

/**
 * HelloService �ӿ�ʵ����
 * 
 * @author lulf
 *
 */
@WebService(serviceName = "HelloService", portName = "HelloServicePort", endpointInterface = "com.epoint.service.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "Hello" + name;
	}

}
