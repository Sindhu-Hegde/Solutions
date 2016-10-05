
public class AccountDemo {
	public static void main(String[] args) {
		
		Account a = new Account("Sindhu", "Savings", 110, 5000);
		Account b = new Account("Rekha", "PF", 220, 3000);
	
		if(a.type == "PF"){
			System.out.println("Cannot withdraw or deposit the amount");
			a.transfer(a,  b, 2000);
		}
		else{
			a.deposit(2000);
			System.out.println("Amount after depositing Rs.2000 is : Rs."+a.balance);
			a.withdraw(1000);
			System.out.println("Amount after withdrawing Rs.1000 is Rs."+a.balance);
			a.transfer(a,  b, 1000);
			System.out.println("Amount after transferring Rs.1000 is :"+a.balance+" "+b.balance);
		}
	
		if(b.type == "PF"){
			System.out.println("Cannot withdraw or deposit the amount");
			b.transfer(a,  b, 2000);
		}
		else{
			a.deposit(2000);
			System.out.println("Amount after depositing Rs.2000 is : Rs."+a.balance);
			a.withdraw(1000);
			System.out.println("Amount after withdrawing Rs.1000 is Rs."+a.balance);
			a.transfer(a,  b, 1000);
			System.out.println("Amount after transferring Rs.1000 is :"+a.balance+" "+b.balance);
		}

	}
}	
