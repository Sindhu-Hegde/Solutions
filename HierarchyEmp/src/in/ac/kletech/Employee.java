package in.ac.kletech;

public class Employee {
	int iEmpID;
	String sName;
	double dSalary;
	double dBonus;
	
	Employee(int iEmpID, String sName, double dSalary){
		this.iEmpID=iEmpID;
		this.sName=sName;
		this.dSalary=dSalary;
	}
	
	double payBonus(){
		return dBonus;
	}
	
	void display(){
		System.out.println("Employee ID: "+this.iEmpID);
		System.out.println("Employee Name "+this.sName);
		System.out.println("Employee Salary :"+this.dSalary);
	}
}

class Manager extends Employee{
	Manager(int iEmpID, String sName, double dSalary){
		super(iEmpID, sName, dSalary);
	}
	
	double payBonus(){
		
		return dBonus = dSalary + 0.10*dSalary;
	}
}

class Salesman extends Employee{
	Salesman(int iEmpID, String sName, double dSalary){
		super(iEmpID, sName, dSalary);
	}
	
	double payBonus(){
		return dBonus=dSalary+0.05d*dSalary;
	}
}