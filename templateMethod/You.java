package com.cai.templateMethod;

public class You extends Bank{

	@Override
	public void transact() {
		System.out.println("穷成狗..要贷款哦");	
	}
	
}
class Laoge extends Bank{
	
	@Override
	public void transact() {
		System.out.println("富得一批，感觉存起来.");
	}
}
