package in.ac.kletech;

public class EmployeeDemo {
	public static void main(String[] args) {
		
	Manager Sindhu = new Manager(3,"Sindhu",500000d);
	Salesman Swati = new Salesman(1,"Swati", 40000d);
	
	
	Sindhu.display();
	System.out.println("Bonus of Manager = "+Sindhu.payBonus());
	Swati.display();
	System.out.println("Bonus of Salesman = "+Swati.payBonus());
	}
}
