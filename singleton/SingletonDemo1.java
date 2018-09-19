package com.cai.singleton;

//懒汉式
public class SingletonDemo1 {
	
	private static SingletonDemo1 instance;
	
	//私有化构造器
	private SingletonDemo1(){
		
	}
	
	public static synchronized SingletonDemo1 getInstance(){
		
		if(instance == null){
			instance = new SingletonDemo1();
		}
		
		return instance;
	}

}
