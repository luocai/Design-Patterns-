package com.cai.chainOfResp;

public class Dean extends Leader{
	
	public Dean(String name) {
		super(name);
	
	}
	
	public void handleRequest(LeaveRequest LeaveRequest) {
        if(LeaveRequest.getLeaveDays() <= 4){   //小于4天院长审批
            System.out.println("院长" + name + "审批" +LeaveRequest.getName() + "同学的请假条,请假天数为" + LeaveRequest.getLeaveDays()+ "天。");
        }
        else{     //否则传递给校长
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(LeaveRequest);
            }
        }
    }

}
