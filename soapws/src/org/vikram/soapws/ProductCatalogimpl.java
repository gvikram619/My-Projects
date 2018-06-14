package org.vikram.soapws;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogimpl {
	
	public List<String> getProducts()
	{
		ArrayList<String> categories= new ArrayList<>();
		categories.add("books");
		categories.add("cars");
		categories.add("guns");
		return categories;
	}

}
