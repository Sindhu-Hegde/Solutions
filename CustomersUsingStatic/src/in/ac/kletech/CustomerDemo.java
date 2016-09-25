package in.ac.kletech;

import java.util.Arrays;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer Sindhu = new Customer(1, "Sindhu", 8998765789l, 1000f);
		Sindhu.display();
		Sindhu.CheckRegularCust();
		System.out.println("Total Bill = Rs."+Sindhu.calBill());
		System.out.println("\n");
		
		Customer Shweta = new Customer(2, "Shweta", 78965789l, 2000);
		Shweta.display();
		Shweta.CheckRegularCust();
		System.out.println("Total Bill = Rs."+Shweta.calBill());
		System.out.println("\n");
		
		Customer Supriya = new Customer(3, "Supriya", 987896578l, 1500);
		Supriya.display();
		Supriya.CheckRegularCust();
		System.out.println("Total Bill = Rs."+Supriya.calBill());
		System.out.println("\n");
		
		Customer.countCust();
		
		System.out.println("\nTotal Bill of all the customers is : "+(Sindhu.calBill()+Shweta.calBill()+Supriya.calBill()));

		int a[] = {1,5, 4, 7, 6};
		Arrays.sort(a);
		System.out.println(a);
	}
	

}
