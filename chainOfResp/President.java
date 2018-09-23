package com.cai.chainOfResp;

public class President extends Leader{

	public President(String name) {
		super(name);
	
	}
	
	public void handleRequest(LeaveRequest LeaveRequest) {
        if(LeaveRequest.getLeaveDays() <= 7){   //小于7天校长审批
            System.out.println("校长" + name + "审批" +LeaveRequest.getName() + "同学的请假条,请假天数为" + LeaveRequest.getLeaveDays()+ "天。");
        }
        else{
        	System.out.println("叫家长来");
        }
 
    }
}
