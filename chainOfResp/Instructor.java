package com.cai.chainOfResp;

public class Instructor extends Leader{

	public Instructor(String name) {
		super(name);
	
	}
	
	public void handleRequest(LeaveRequest LeaveRequest) {
        if(LeaveRequest.getLeaveDays() <= 2){   //小于2天辅导员审批
            System.out.println("辅导员" + name + "审批" +LeaveRequest.getName() + "同学的请假条,请假天数为" + LeaveRequest.getLeaveDays()+ "天。");
        }
        else{     //否则传递给院长
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(LeaveRequest);
            }
        }
    }

}
