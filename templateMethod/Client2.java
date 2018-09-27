package com.cai.templateMethod;

public class Client2 {
	
	public static void main(String[] args) {
		Bank you = new You();
		you.process();
		
		System.out.println(".....");
		
		Bank laoge = new Laoge();
		laoge.process();
	}

}
