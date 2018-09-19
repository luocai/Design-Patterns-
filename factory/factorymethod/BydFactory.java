package com.cai.factory.factorymethod;

public class BydFactory implements CarFactory{


	public Car creatCar() {
		
		return new Byd();
	}
	
}
