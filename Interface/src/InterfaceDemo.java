
public class InterfaceDemo {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.display(30);
		B obj2 = new B();
		obj2.display(50);
		
		Interface i = obj1;
		i.display(10);
		 i = obj2;
		i.display(100);
		((B)(i)).displayid();
	}
}
