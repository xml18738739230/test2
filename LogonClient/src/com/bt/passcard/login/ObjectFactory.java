package com.bt.passcard.login;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.bt.passcard.login package.
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

	private final static QName _LogonCheckResponse_QNAME = new QName(
			"http://login.passcard.bt.com/", "logonCheckResponse");
	private final static QName _LogonCheck_QNAME = new QName(
			"http://login.passcard.bt.com/", "logonCheck");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.bt.passcard.login
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link LogonCheck }
	 * 
	 */
	public LogonCheck createLogonCheck() {
		return new LogonCheck();
	}

	/**
	 * Create an instance of {@link LogonCheckResponse }
	 * 
	 */
	public LogonCheckResponse createLogonCheckResponse() {
		return new LogonCheckResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LogonCheckResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://login.passcard.bt.com/", name = "logonCheckResponse")
	public JAXBElement<LogonCheckResponse> createLogonCheckResponse(
			LogonCheckResponse value) {
		return new JAXBElement<LogonCheckResponse>(_LogonCheckResponse_QNAME,
				LogonCheckResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LogonCheck }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://login.passcard.bt.com/", name = "logonCheck")
	public JAXBElement<LogonCheck> createLogonCheck(LogonCheck value) {
		return new JAXBElement<LogonCheck>(_LogonCheck_QNAME, LogonCheck.class,
				null, value);
	}

}
