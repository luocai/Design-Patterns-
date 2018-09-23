package com.cai.proxy.staticProxy;

class RealSinger implements Singer{

	@Override
	public void sing() {
	
		System.out.println("击杀 双杀 三杀 Penta kill");
	}
	
}