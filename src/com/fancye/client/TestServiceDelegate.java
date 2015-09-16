package com.fancye.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "TestServiceDelegate", targetNamespace = "http://fancye.com/")
public interface TestServiceDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getList", targetNamespace = "http://fancye.com/", className = "com.fancye.client.GetList")
	@ResponseWrapper(localName = "getListResponse", targetNamespace = "http://fancye.com/", className = "com.fancye.client.GetListResponse")
	public List<String> getList(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
     * 
     */
	@WebMethod
	@RequestWrapper(localName = "sayHello", targetNamespace = "http://fancye.com/", className = "com.fancye.client.SayHello")
	@ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://fancye.com/", className = "com.fancye.client.SayHelloResponse")
	public void sayHello();

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "sayHelloToPersion", targetNamespace = "http://fancye.com/", className = "com.fancye.client.SayHelloToPersion")
	@ResponseWrapper(localName = "sayHelloToPersionResponse", targetNamespace = "http://fancye.com/", className = "com.fancye.client.SayHelloToPersionResponse")
	public String sayHelloToPersion(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

}