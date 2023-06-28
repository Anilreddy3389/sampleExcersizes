package com.designPatterns.factory;

public class FactoryDriver {

	public static void main(String[] args) {
		OsFactoryImpl osFactoryImpl = new OsFactoryImpl();
		Object obj = osFactoryImpl.getInstance("Open Source");
		System.out.println("object is returned::"+ obj);
	}
}

