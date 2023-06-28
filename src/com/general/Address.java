package com.general;

public class Address implements Cloneable{

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + "]";
	}

	public int addressId;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
