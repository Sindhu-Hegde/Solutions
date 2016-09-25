package in.ac.kletech;

public class UserDemo {
	public static void main(String[] args)
	{
		User u = new User("Z","abc");
		u.createUsers("a", "reg", 10);
		u.createUsers("b", "reg", 20);
		u.createUsers("c", "reg", 15);
		u.createUsers("d", "reg", 30);
		u.createUsers("e", "reg", 2);
		System.out.println("Users before sort");
		u.printUsers();
		
		u.sortUsers();
		
		System.out.println("Users after sort");
		u.printUsers();
		
		
		
		
		
		
		
		
		/*User[] users=u.createUsers();
		System.out.println("User before sort");
		u.printUsers(users);		
		u.sortUsers(users);
		System.out.println("User after sort");
		u.printUsers(users);*/
	}	

}
