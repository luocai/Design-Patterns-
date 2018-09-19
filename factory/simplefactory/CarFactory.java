package com.cai.factory.simplefactory;

public class CarFactory {
	
	public Car CreateCar(String type){
		if("奥迪".equals(type)){
			return new Aodi();
		}else if("比亚迪".equals(type)){
			return new Byd();
		}else if(("奔驰").equals(type)){
			return new Benz();
		}else{
			return null;
		}
	}

}
