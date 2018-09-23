package com.cai.proxy.staticProxy;

class ProxySinger implements Singer{
	
	private Singer singer;
	
	public ProxySinger(Singer singer) {
		this.singer = singer;
	}

	@Override
	public void sing() {
		System.out.println("大家好，我是周杰伦，哎呦不错哦");		
		singer.sing();
		System.out.println("观众朋友们，我唱完歌啦，我要回去喝奶茶啦 拜拜");	
	}
	
}
