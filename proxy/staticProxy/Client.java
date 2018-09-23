package com.cai.proxy.staticProxy;


public class Client {
	public static void main(String[] args) {
		Singer singer = new RealSinger();
		Singer proxy = new ProxySinger(singer);
		
		proxy.sing();		
	}
}
