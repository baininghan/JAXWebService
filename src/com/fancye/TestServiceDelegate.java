package com.fancye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;

@javax.jws.WebService(targetNamespace = "http://fancye.com/", serviceName = "TestServiceService", portName = "ws", wsdlLocation = "WEB-INF/wsdl/TestServiceService.wsdl")
public class TestServiceDelegate {

	com.fancye.TestService testService = new com.fancye.TestService();

	public void sayHello() {
		testService.sayHello();
	}

	public String sayHelloToPersion(String name) {
		return testService.sayHelloToPersion(name);
	}

	public List<String> getList(String name) {
		return testService.getList(name);
	}

}