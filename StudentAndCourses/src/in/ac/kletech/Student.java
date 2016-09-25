package in.ac.kletech;

public class Student {
	private int iStudID;
	private String sStudName;
	private int iSemester;
	Course[] c = new Course[4];
	int i;
	
	public int getiStudID() {
		return iStudID;
	}
	public String getsStudName() {
		return sStudName;
	}
	public int getiSemester() {
		return iSemester;
	}
	
	public Student(int iStudID, String sStudName, int iSemester){
		this.iStudID=iStudID;
		this.sStudName=sStudName;
		this.iSemester=iSemester;
	}
	
	void regCourses(int iCourseNo, String sCourseTitle, int iCourseDuration, boolean sFavCourse){
		c[i++] = new Course(iCourseNo, sCourseTitle, iCourseDuration, sFavCourse);
	}
	
	/*void view(){
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
	}*/
	
	
	public String FavCourse(){
	//	String temp = null;
		for(i=0; i<c.length; i++){
			if(c[i].getsFevouriteCourse()== true){
				return  c[i].getsCourseTitle();
			}
		}
	 
			return c[i].getsCourseTitle();
	}
}
