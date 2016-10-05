
public interface Bank {
	void deposit(double Amt);
	double withdraw(double Amt);
	void transfer(Account a, Account b, double TransAmt);
}


