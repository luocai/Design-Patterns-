package com.cai.chainOfResp;

public class Client {
	
	public static void main(String[] args) {
		
		
		 Leader instructor = new Instructor("老王");       //辅导员
	     Leader dean = new Dean("老李");      //院长
	     Leader president = new President("老谢");     //校长
	        
	     instructor.setNextLeader(dean);       //辅导员的后续者是院长
	     dean.setNextLeader(president);         //院长的后继者是校长
	     
	     LeaveRequest le = new LeaveRequest("我", 1);
	     instructor.handleRequest(le);
	     
	     le = new LeaveRequest("哥", 3);
	     instructor.handleRequest(le);
	     
	     le = new LeaveRequest("qiu", 5);
	     instructor.handleRequest(le);
	     
	     le = new LeaveRequest("ll", 11);
	     instructor.handleRequest(le);
	}

}
