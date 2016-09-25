package in.ac.kletech;



public class User {
	String name;
	String type;
	private int id;
	static int stuId=0;
	int i;
	User[] u = new User[5];
	
	User()
	{
		
	}// default constructor

	User(String name){ 	
		this.name=name;
		id=stuId++;
	}
	
	User(String name, String type)
	{
		this.name=name;
		this.type=type;
		id=stuId++;
	}
	
	
	
	public User(String name, String type, int id) {
		
		this.name = name;
		this.type = type;
		this.id = id;
	}

	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return (id+":"+name+":"+type);
	}
	
	void createUsers(String name, String type, int id){
		u[i++] = new User(name, type, id);
	}
	
	void printUsers()
	{
		for(int i=0;i<u.length;i++)
		{
			System.out.println(u[i]);
		}
	}
	
	void sortUsers()
	{
		User temp;
		for(int j=0; j<u.length; j++)
		{	
			for(i=0; i<u.length-1; i++)
			{
				if(u[i].id>u[i+1].id)
				{
					temp = u[i];
					u[i] = u[i+1];
					u[i+1] = temp;
				}
			}
		}	
	} 

}


/*package in.ac.kletech;



public class User {
	String name;
	String type;
	private int id;
	static int stuId=0;
	User()
	{
		
	}// default constructor

	User(String name){ 	
		this.name=name;
		stuId++;
		id=stuId;
	}
	
	User(String name, String type)
	{
		this.name=name;
		this.type=type;
		id=stuId++;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return (id+":"+name+":"+type);
	}
	
	static User[] createUsers()
	{
		User[] u=new User[5];
		u[0]=new User("aaa","admin");
		u[0].id=10;
		u[1]=new User("bbb","normal");
		u[1].id=5;
		u[2]=new User("ccc","normal");
		u[2].id=3;
		u[3]=new User("ddd","normal");
		u[3].id=8;
		u[4]=new User("eee","normal");
		u[4].id=1;
		return u;
	}
	void printUsers(User[] u)
	{
		for(int i=0;i<u.length;i++)
		{
			System.out.println(u[i]);
		}
	}
	
	void sortUsers(User[] u)
	{
		User temp = new User();
		temp = null;
		for(int j=0; j<u.length; j++)
		{	
			for(int i=0; i<u.length-1; i++)
			{
				if(u[i].id>u[i+1].id)
				{
					temp = u[i];
					u[i] = u[i+1];
					u[i+1] = temp;
				}
			}
		}	
	} 

}
*/