package com.cai.singleton;

//静态内部类
public class SingletonDemo4 {
	
	
	private static class SingletonClassInstance { 
		private static final SingletonDemo4 instance = new SingletonDemo4(); 
	} 

	
	private SingletonDemo4(){
		
	}
	
	public static SingletonDemo4 getInstance(){
		
		return SingletonClassInstance.instance;
		
	}
	
}
