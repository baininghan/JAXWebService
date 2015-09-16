package com.fancye.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.fancye.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetList_QNAME = new QName("http://fancye.com/",
			"getList");
	private final static QName _GetListResponse_QNAME = new QName(
			"http://fancye.com/", "getListResponse");
	private final static QName _SayHelloToPersionResponse_QNAME = new QName(
			"http://fancye.com/", "sayHelloToPersionResponse");
	private final static QName _SayHello_QNAME = new QName(
			"http://fancye.com/", "sayHello");
	private final static QName _SayHelloResponse_QNAME = new QName(
			"http://fancye.com/", "sayHelloResponse");
	private final static QName _SayHelloToPersion_QNAME = new QName(
			"http://fancye.com/", "sayHelloToPersion");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.fancye.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SayHello }
	 * 
	 */
	public SayHello createSayHello() {
		return new SayHello();
	}

	/**
	 * Create an instance of {@link SayHelloToPersionResponse }
	 * 
	 */
	public SayHelloToPersionResponse createSayHelloToPersionResponse() {
		return new SayHelloToPersionResponse();
	}

	/**
	 * Create an instance of {@link GetList }
	 * 
	 */
	public GetList createGetList() {
		return new GetList();
	}

	/**
	 * Create an instance of {@link GetListResponse }
	 * 
	 */
	public GetListResponse createGetListResponse() {
		return new GetListResponse();
	}

	/**
	 * Create an instance of {@link SayHelloToPersion }
	 * 
	 */
	public SayHelloToPersion createSayHelloToPersion() {
		return new SayHelloToPersion();
	}

	/**
	 * Create an instance of {@link SayHelloResponse }
	 * 
	 */
	public SayHelloResponse createSayHelloResponse() {
		return new SayHelloResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "getList")
	public JAXBElement<GetList> createGetList(GetList value) {
		return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "getListResponse")
	public JAXBElement<GetListResponse> createGetListResponse(
			GetListResponse value) {
		return new JAXBElement<GetListResponse>(_GetListResponse_QNAME,
				GetListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SayHelloToPersionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "sayHelloToPersionResponse")
	public JAXBElement<SayHelloToPersionResponse> createSayHelloToPersionResponse(
			SayHelloToPersionResponse value) {
		return new JAXBElement<SayHelloToPersionResponse>(
				_SayHelloToPersionResponse_QNAME,
				SayHelloToPersionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "sayHello")
	public JAXBElement<SayHello> createSayHello(SayHello value) {
		return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SayHelloResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "sayHelloResponse")
	public JAXBElement<SayHelloResponse> createSayHelloResponse(
			SayHelloResponse value) {
		return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME,
				SayHelloResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SayHelloToPersion }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://fancye.com/", name = "sayHelloToPersion")
	public JAXBElement<SayHelloToPersion> createSayHelloToPersion(
			SayHelloToPersion value) {
		return new JAXBElement<SayHelloToPersion>(_SayHelloToPersion_QNAME,
				SayHelloToPersion.class, null, value);
	}

}
