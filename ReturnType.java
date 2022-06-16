package com.Class.org;

public class ReturnType {
	
	String recievedMail="Leave Submitted for Approval ";
	
	public void AdminSentMailApprovalToEmployee() {
	
	//public String AdminSentApprovalToEmployee() {
		
	System.out.println("Admin:I Have sent the mail that which the employee  " +recievedMail+ "and approved"); 
		
	//return recievedMail;
	
	}

	public static void main(String[] args) {
	
	ReturnType Employee=new ReturnType();
		
	//Employee.AdminSentMailApprovalToEmployee();
		
	//String EmployeeRecievedMail=Employee.AdminSentApprovalToEmployee();
		
	//System.out.println("Employee:Mail has been received from the Admin in which "+EmployeeRecievedMail+ "and got approved from the Manager");

	}

}