package com.general;

public class OverLoading {

	public static void gfg(String s)
    {    
        System.out.println("String");
    }
	
	
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
    
	public static void main(String[] args) {
		String s = new String();
		s = null;
		gfg(s);
	}
}
