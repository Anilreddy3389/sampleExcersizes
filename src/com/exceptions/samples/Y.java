package com.exceptions.samples;

public class Y {

	void b(){

		try{
			int x = 10;
			int y = x/0;

		}catch(Exception e){
			
			System.out.println("from y::void");
		e.printStackTrace();

		}
	}
	/*void b() {
		int x = 10;
		int y = x/0;
	}*/
}
