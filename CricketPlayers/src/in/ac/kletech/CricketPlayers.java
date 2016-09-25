package in.ac.kletech;

public class CricketPlayers {
	String name;
	int noOfInnings;
	int totalRuns;
	double batAvg;
	static int i, j;
	static Players[] p = new Players[5];
	
	public CricketPlayers(String name, int noOfInnings, int totalRuns, double batAvg) {
		
		this.name = name;
		this.noOfInnings = noOfInnings;
		this.totalRuns = totalRuns;
		this.batAvg = batAvg;
	}

	@Override
	public String toString() {
		return "CricketPlayers [name=" + name + ", noOfInnings=" + noOfInnings
				+ ", totalRuns=" + totalRuns + ", batAvg=" + batAvg + "]";
	}
	
	void createPlayers(String name, int noOfInnings, int totalRuns, double batAvg){
		p[i++] = new Players(name, noOfInnings, totalRuns, batAvg);
	}
	
	static void sortPlayers(){
		Players temp;
		for(j=0; j<5; j++)
		{
			for(i=0; i<4; i++){
				if(p[i].totalRuns > p[i+1].totalRuns){
					temp = p[i];
					p[i] = p[i+1];
					p[i+1] = temp;
				}
			}
		}
	}
	
	void display(){
		for(i=0; i<p.length; i++)
		{
			System.out.println(p[i]);
		}	
	}
	
	void display(String name){
		for(i=0; i<p.length; i++){
			System.out.println("Name :" + p[i].name);
		}	
	}
	
	
}
