package com.fancye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 服务接口，使用 MyEclipse 自带的 JAX-WS 插件实现，定义三个公共方法
 * TestServiceDelegate 是 TestService 的映射代理类，由 JAX-WS 插件 自动生成
 * @author Fancye
 * 
 */
@WebService
public class TestService {

	public void sayHello() {
		System.out.println("Hello!");
	}

	public String sayHelloToPersion(String name) {
		return "Hello, " + name;
	}

	public List<String> getList(String name) {
		List<String> list = new ArrayList<String>();
		list.add(name);

		return list;
	}

	// java.util.Map is an interface, and JAXB can't handle interfaces.
	// 需要借助适配器来解决 @XmlJavaTypeAdapter
	// public Map<String, String> getMap(String name){
	// Map<String, String> map = new HashMap<String, String>();
	// map.put("a", name);
	//
	// return map;
	// }
}
