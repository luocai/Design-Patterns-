package com.cai.templateMethod;

public abstract class Bank {
	
	public void queue(){
		System.out.println("老子在排队，累死了");
	}
	
	public abstract void transact();
	
	public void leave(){
		System.out.println("溜了溜了");
	}

	public final void process(){	//模板方法！！！
		this.queue();

		this.transact();

		this.leave();
	}
}


