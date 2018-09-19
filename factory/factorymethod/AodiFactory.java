package com.cai.factory.factorymethod;

public class AodiFactory implements CarFactory{

	public Car creatCar() {

		return new Aodi();
	}

}
