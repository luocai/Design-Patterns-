package com.cai.singleton;

//饿汉式
public class SingletonDemo2 {
	
	private static SingletonDemo2 instance = new SingletonDemo2();
	
	//私有化构造器
	private SingletonDemo2(){
		
	}
	
	public static SingletonDemo2 getInstance(){
		
		return instance;
		
	}

}
