package in.ac.kletech;

import java.util.Scanner;

public class Customer {
	private int iCustomerID;
	private String sCustomerName;
	private long lPhoneNo;
	private double dBillAmt;
	int choice;
	double discount;
	static int countReg;
	static int countPriv;
	
	public int getiCustomerID() {
		return iCustomerID;
	}
	public String getsCustomerName() {
		return sCustomerName;
	}
	public long getlPhoneNo() {
		return lPhoneNo;
	}
	public double getdBillAmt() {
		return dBillAmt;
	}
	
	Customer(int iCustomerID, String sCustomerName, long lPhoneNo, double dBillAmt){
		this.iCustomerID=iCustomerID;
		this.sCustomerName=sCustomerName;
		this.lPhoneNo=lPhoneNo;
		this.dBillAmt=dBillAmt;
	}
	
	public void display(){
		System.out.println("Customer ID :" + this.iCustomerID);
		System.out.println("Customer Name:"+ this.sCustomerName);
		System.out.println("Customer Telephone No:"+this.lPhoneNo);
		System.out.println("Customer BillAmount:"+this.dBillAmt);
	}
	
	void CheckRegularCust(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the choice as 1 for regular customer and 2 for privileged customer");
		choice = sc.nextInt();
		switch(choice){
		case 1: System.out.println("Regular Customer");
				calDiscountReg();
				countReg++;
				break;
		case 2: System.out.println("Privileged Customer");
				countPriv++;
				calDiscountPriv();
				break;
		case 3: System.out.println("Wrong choice");		
		}
	}
	
	double calDiscountReg(){
		discount = 0.05f * dBillAmt;
		return discount;
	}
	
	double calDiscountPriv(){
		discount = 0.10f * dBillAmt;
		return discount;
	}
	
	double calBill(){
		return (dBillAmt - discount);
	}
	
	static void countCust(){
		System.out.println("Total Number of regular Customers ="+countReg);
		System.out.println("Total Number of privileged Customers ="+countPriv);
	}
}
