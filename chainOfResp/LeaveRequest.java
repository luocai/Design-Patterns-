package com.cai.chainOfResp;

/**
 * 封装请假的基本信息
 * @author Administrator
 *
 */
public class LeaveRequest {
	private String name;
	private int leaveDays;
	
	public LeaveRequest(String name, int leaveDays) {
		super();
		this.name = name;
		this.leaveDays = leaveDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}	
}
