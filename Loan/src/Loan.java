import java.util.Scanner;


public class Loan implements Bank{
	Customer c = new Customer("Sindhu", "abc",7000007869l);
	
	int choice;
	double emi;
	double loanAmt;
	double rate;
	int time;
	
	void display(){
		System.out.println("Customer Details:");
		System.out.println("Name :"+c.sName);
		System.out.println("Address: "+c.address);
		System.out.println("Contact No: "+c.contactNo);
	}
	
	
	Scanner sc = new Scanner(System.in);
	void checkLoanType(){
		System.out.println("Enter the choice:\n1 for 4 wheeler loan\n2 for two wheeler loan");
		choice = sc.nextInt();
		
		switch(choice){
		case 1: System.out.println("4 Wheeler Loan");
				emi = calEMI();
				System.out.println("Monthly EMI is Rs.: "+emi);
				break;
		case 2: System.out.println("2 Wheeler Loan");
				emi = calEMI();
				System.out.println("Monthly EMI is Rs.:" +emi);
				break;
		default: System.out.println("Wrong choice");		
		
		}
	}

	@Override
	public double calEMI() {
		
		
		System.out.println("Enter the loan amount");
		loanAmt=sc.nextFloat();
		
		System.out.println("Enter the EMI Rate");
		rate=sc.nextFloat();
		
		System.out.println("Enter the time in year");
		time = sc.nextInt();
		
		rate = rate/(12*100);
		time=time*12;
		
		emi = (loanAmt*rate*Math.pow(1+rate, time))/(Math.pow(1+rate, time)-1);
		
		return emi;
	}
	
	double totEmi(){
		return (emi*time);
	}
}
