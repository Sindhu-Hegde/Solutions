
public class Account implements Bank{
	String sName;
	String type;
	int AccNo;
	double balance;

	public Account(String sName, String type, int accNo, double balance) {
		super();
		this.sName = sName;
		this.type = type;
		this.AccNo = accNo;
		this.balance=balance;
	}

	@Override
	public void deposit(double Amt) {
		this.balance += Amt;
		System.out.println("Balance after deposit "+ Amt);
	}

	@Override
	public double withdraw(double Amt) {
		this.balance -= Amt;
		return this.balance;
	}

	@Override
	public void transfer(Account a, Account b, double TransAmt) {
		a.balance-=TransAmt;
		b.balance+=TransAmt;
		System.out.println("Amount transferred from the following Account:\tName :"+a.sName+" Balance :"+a.balance);
		System.out.println("Amount transferred to the following Account:\tName :"+b.sName+" Balance :"+b.balance);
	}
	
	
}
