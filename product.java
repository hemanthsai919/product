package com.cg.demo.method;

public class product {

	int modelno;
	String name;
	double price;
	String color;
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}





	public product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}




	public product(int modelno, String name, double price, String color) {
		super();
		this.modelno = modelno;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "product [modelno=" + modelno + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
	
}

//	product() {
//		System.out.println("Default Constructor");
//	}
//	
//	@Override
//    public String toString() {
//        return "product [modelno=" + modelno + ", name=" + name + ", price=" + price + ",  color=" + color+ "]";
//    }
//
//}

	
	