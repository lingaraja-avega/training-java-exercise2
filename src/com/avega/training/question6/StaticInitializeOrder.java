package com.avega.training.question6;

public class StaticInitializeOrder {
	public static final String place;
	static {
		place = "Tambaram";
		System.out.println(place);
//		System.out.println(pincode);
	}
	public static final int pincode = 600045;

	public static void main(String[] args) {
		StaticInitializeOrder sio = new StaticInitializeOrder();
	}
}

//This Code will not run  
