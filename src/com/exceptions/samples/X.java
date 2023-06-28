package com.exceptions.samples;

public class X {

	void demo(){

		try {

			Y y = new Y();

			y.b();
			
			Z z = new Z();

			z.c();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	public static void main(String[] args) {
		X x = new X();
		x.demo();
	}
}