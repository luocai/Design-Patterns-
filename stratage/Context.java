package com.cai.stratage;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy stratege) {
		this.strategy = stratege;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doOneThing(){
		strategy.dothing();
	}

}
