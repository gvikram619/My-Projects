package org.vikram.soapws;

import javax.xml.ws.Endpoint;

public class soapwspublisher {

	public static void main(String args[])
	{
		Endpoint.publish("http://localhost:9279/prcatalog", new ProductCatalog());
	}
}
