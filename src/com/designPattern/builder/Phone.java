package com.designPattern.builder;

public class Phone {

	private String os; // required
	private String processor; // required
	private double screenSize; // optional
	private int battery; // optional
	private int camera; // optional

	public Phone(String os, String processor, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + "]";
	}

}
