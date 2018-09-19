package com.cai.factory.abstractfactory;

public interface Seat {
	void sense();
}

class LuxurySeat implements Seat{

	@Override
	public void sense() {
		System.out.println("舒服哦");
		
	}
	
}

class LowSeat implements Seat{

	@Override
	public void sense() {
		System.out.println("蛮糟糕");
		
	}
	
}