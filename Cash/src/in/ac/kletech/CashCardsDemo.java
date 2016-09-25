package in.ac.kletech;

public class CashCardsDemo {
	public static void main(String[] args) {
		
		CreditCards c1 = new CreditCards("Sindhu", "SBI", 500d);
		c1.swipe();
		DebitCards d = new DebitCards("Sindu", "SBM", 0.0);
		d.swipe();
		System.out.println(d.generateBala(c1));
		
		
		
	}
}
