
public class LoanDemo {
	public static void main(String[] args) {
		Loan l = new Loan();
		l.display();
		l.checkLoanType();
		System.out.println("Total EMI to be paid = Rs."+l.totEmi());
		
	}
}
