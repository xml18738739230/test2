package com.bt.passcard.login;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * LogonServiceService service = new LogonServiceService();
 * LogonService portType = service.getLogonServicePort();
 * portType.logonCheck(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "LogonServiceService", targetNamespace = "http://login.passcard.bt.com/", wsdlLocation = "http://localhost:9009/Service/LogonService?wsdl")
public class LogonServiceService extends Service {

	private final static URL LOGONSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.bt.passcard.login.LogonServiceService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.bt.passcard.login.LogonServiceService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:9009/Service/LogonService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9009/Service/LogonService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		LOGONSERVICESERVICE_WSDL_LOCATION = url;
	}

	public LogonServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public LogonServiceService() {
		super(LOGONSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://login.passcard.bt.com/", "LogonServiceService"));
	}

	/**
	 * 
	 * @return returns LogonService
	 */
	@WebEndpoint(name = "LogonServicePort")
	public LogonService getLogonServicePort() {
		return super.getPort(new QName("http://login.passcard.bt.com/",
				"LogonServicePort"), LogonService.class);
	}

}
