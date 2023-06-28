package com.designPattern.builder;

public class BuilderDriver {

	public static void main(String[] args) {
		
		PhoneBuilder phoneBuilder = new PhoneBuilder("Andriod", "Qualcom");
		Phone phone = phoneBuilder.setBattery(5000).getPhone();
				
		System.out.println("phone::"+ phone);
	}
}
