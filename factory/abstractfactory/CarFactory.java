package com.cai.factory.abstractfactory;

public interface CarFactory {
	
	Engine createEngine();
	Seat createSeat();
	
}

class LuxuryCar implements CarFactory{

	@Override
	public Engine createEngine() {
		
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
		
	}
	
}

class LowCar implements CarFactory{

	@Override
	public Engine createEngine() {
		
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
		
	}
	
}