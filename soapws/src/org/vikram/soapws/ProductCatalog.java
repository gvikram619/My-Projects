package org.vikram.soapws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name="testcatalog", portName="testcatalogport", serviceName="testcatalogservice",
targetNamespace="http://www.testmart619.com")
public class ProductCatalog {

	ProductCatalogimpl product = new ProductCatalogimpl();
	
	@WebMethod
	public List<String> getCategories()
	{
		return product.getProducts();
	}
	
}
