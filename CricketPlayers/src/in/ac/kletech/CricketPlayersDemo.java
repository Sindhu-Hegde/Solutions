package in.ac.kletech;

public class CricketPlayersDemo {
	public static void main(String[] args) {
		
	CricketPlayers c = new CricketPlayers("Dhoni", 10, 5, 2.3);
	//Players p = new Players("b", 100, 23, 4.5);
	c.createPlayers("a", 100, 32, 2.5);
	c.createPlayers("b", 100, 30, 2.5);
	c.createPlayers("c", 100, 20, 2.5);
	c.createPlayers("d", 100, 50, 2.5);
	c.createPlayers("e", 100, 10, 2.5);
	
	c.display("a");
	CricketPlayers.sortPlayers();
	c.display();
	
	
	
	
	}
}
