package com.cai.proxy.dynamicProxy;

import com.cai.proxy.dynamicProxy.RealSinger;
import com.cai.proxy.dynamicProxy.Singer;

public class Client2 {
	
	
	
	public static void main(String[] args) {
		Singer singer = new RealSinger();
		Singer proxy = (Singer)new ProxyFactory(singer).getInstance();
		
		proxy.sing();
	}

}
