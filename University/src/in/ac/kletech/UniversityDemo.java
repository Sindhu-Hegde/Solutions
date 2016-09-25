package in.ac.kletech;

public class UniversityDemo {
	public static void main(String[] args) {
		boolean t;
		int total;
		University KLE = new University("E30");
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		KLE.createSchools(1, "aa", 100, 13);
		
		t = KLE.intake();
		if(t == true){
			System.out.println("Total Strength of School is " + KLE.calTotalStrength());
		}
		
		University KLE2 = new University("E241");
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 100, 44);
		KLE2.createSchools(2, "a", 200, 44);
		
		t = KLE2.intake();
		if(t == true)
			System.out.println("Total Strength of School is "+KLE2.calTotalStrength());
		
		total = KLE.calTotalStrength()+KLE2.calTotalStrength();
		
		System.out.println("Total Strength of University is " + total);
		
	}	
	
	
}
