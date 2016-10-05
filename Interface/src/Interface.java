
public interface Interface {
	int id=10;
	void display(int id);
}

class A implements Interface{
	//int id = 10;
	
	@Override
	public void display(int id) {
		System.out.println("ID in A:"+id);
	}
}

class B extends A implements Interface{
	//int id = 20;

	@Override
	public void display(int id) {
		System.out.println("ID in B :"+id);
	}
	
	void displayid(){
		System.out.println("ID :"+id);
	}
}

