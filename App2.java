package com.cg.demo.method;

public class App2 {

	public static void main(String[] args) {
		
		int num = 12;
		product obj = new product();
		obj.modelno = 232;
		obj.name = "ABC MObile";
		obj.price = 12345.55;
		obj.color = "Black";
		System.out.println(obj.toString());
		
		product obj2 = new product();
		obj2.modelno = 262;
		obj2.name = "EDF MObile";
		obj2.price = 12345.55;
		obj2.color = "Green";
		System.out.println(obj2.toString());
		
		}


}
