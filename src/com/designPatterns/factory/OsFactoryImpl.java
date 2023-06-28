package com.designPatterns.factory;

public class OsFactoryImpl {

	public static Object getInstance(String os) {
		if(os.equals("Secure")) {
			return new Ios();
		}else {
			return new Android();
		}
	}
}
