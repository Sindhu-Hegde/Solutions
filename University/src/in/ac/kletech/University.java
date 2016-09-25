package in.ac.kletech;

public class University {
	String CETCode;
	int i;
	
	School[] sch = new School[8];
	
	University(String CETCode){
		this.CETCode=CETCode;
	}
	
	void createSchools(int programCode, String schoolCoordinator, int noOfStud, int noOfStaff){
		sch[i++] = new School(programCode, schoolCoordinator, noOfStud, noOfStaff);
	}
	
	public boolean intake()
	{
		for(i=0; i<sch.length; i++){
			if(sch[i].noOfStud > 120){
				System.out.println("Intake cannot be greater than 120");
				return false;
			}
		}	
			
		return true;
		
	}
	
	int calTotalStrength(){
		int tot=0;
		for(i=0; i<sch.length; i++){
			if(sch[i].noOfStud != 0){
				tot = tot + sch[i].noOfStud;
			}
		}
		return tot;
	}
}
