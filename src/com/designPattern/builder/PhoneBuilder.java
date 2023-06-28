package com.designPattern.builder;

public class PhoneBuilder {

	private String os; // required
	private String processor; // required
	private double screenSize; // optional
	private int battery; // optional
	private int camera; // optional
	
	
	public PhoneBuilder(String os, String processor) {
		super();
		this.os = os;
		this.processor = processor;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, processor, screenSize, battery, camera);
	}
	
	
	
	
	
}
