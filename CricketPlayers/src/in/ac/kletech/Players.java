package in.ac.kletech;

public class Players extends CricketPlayers{

	public Players(String name, int noOfInnings, int totalRuns, double batAvg) {
		super(name, noOfInnings, totalRuns, batAvg);
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", noOfInnings=" + noOfInnings
				+ ", totalRuns=" + totalRuns + ", batAvg=" + batAvg
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}
	
	
}
