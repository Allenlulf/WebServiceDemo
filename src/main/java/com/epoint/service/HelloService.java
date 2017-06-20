package com.epoint.service;

import javax.jws.WebService;

/**
 * WebService 接口方法
 * 
 * @author lulf
 */
@WebService
public interface HelloService {
	
	String say(String name);
}
