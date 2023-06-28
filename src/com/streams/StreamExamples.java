package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamExamples {

	public static void main(String []args) {
		
		List<Product> productList = new ArrayList<>();
		productList = intiliseProdcuts(productList);
		
		Map<String, Long> groupByBrandMap = productList.stream()
				.collect(Collectors.groupingBy(Product::getProductBrand, Collectors.counting()));
		
		System.out.println("groupByBrandMap::::"+ groupByBrandMap);
	}
	
	
	public static List<Product> intiliseProdcuts(List<Product> productList){
		Product product1 = new Product(101, 10000, "pepsi", "US");
		Product product2 = new Product(101, 10000, "ThumsUp", "IND");
		Product product3 = new Product(101, 10000, "sprite", "IND");
		Product product4 = new Product(101, 10000, "7up", "US");
		Product product5 = new Product(101, 10000, "cola", "SL");
		Product product6 = new Product(101, 10000, "coke", "SL");
		Product product7 = new Product(101, 10000, "duke", "US");
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		productList.add(product6);
		productList.add(product7);
		
		return productList;
	}
	
	
	
	
}




