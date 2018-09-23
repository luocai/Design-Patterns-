package com.cai.stratage;

public class Client {
	
	public static void main(String[] args) {
		Strategy sunnyday = new SunnyStrategy();
		Context context = new Context(sunnyday);
		
		context.doOneThing();
	}

}
