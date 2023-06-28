package com.general;

import java.util.ArrayList;
import java.util.List;

public final class Immutableclass {

	private final int v1;
	private final int v2;
	private List<Address> addList ;
	
	
	public int getV1() {
		return v1;
	}

	public int getV2() {
		return v2;
	}

	public List<Address> getAddList() {
		List<Address> addresslist = new ArrayList<>();
		for(Address a : addList) {
			addresslist.add(a);
		}
		return addresslist;
	}

	public Immutableclass(int v1, int v2, List<Address> addList) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.addList = new ArrayList<>();
		for(Address a : addList) {
			this.addList.add(a);
		}
	}


	public static void main(String[] args) {
		List<Address> addList = new ArrayList<>();
		Address ad1 = new Address();
		ad1.addressId = 101;
		
		Address ad2 = new Address();
		ad2.addressId = 102;
		
		addList.add(ad1);
		addList.add(ad2);
		Immutableclass immutableclass1= new Immutableclass(1, 2, addList);
		
		System.out.println("immutableclass1::"+ immutableclass1);
		
		Immutableclass immutableclass2= new Immutableclass(1, 3, addList);
		addList.get(0).addressId = 103;//even u r trying to change it wont beacuse maintaing the immutable
		System.out.println("immutableclass2::"+ immutableclass2);

	}

	@Override
	public String toString() {
		return "Immutableclass [v1=" + v1 + ", v2=" + v2 + ", addList=" + addList + "]";
	}

}
