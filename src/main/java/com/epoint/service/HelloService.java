package com.epoint.service;

import javax.jws.WebService;

/**
 * WebService �ӿڷ���
 * 
 * @author lulf
 */
@WebService
public interface HelloService {
	
	String say(String name);
}
