package in.ac.kletech;

public class Course {
	private int iCourseNo;
	private String sCourseTitle;
	private int iCourseDuration;
	private boolean sFavCourse;
	
	public int getiCourseNo() {
		return iCourseNo;
	}
	public String getsCourseTitle() {
		return sCourseTitle;
	}
	public int getiCourseDuration() {
		return iCourseDuration;
	}
	public boolean getsFevouriteCourse() {
		return sFavCourse;
	}
	
	Course(int iCourseNo, String sCourseTitle, int iCourseDuration, boolean sFavCourse){
		this.iCourseNo=iCourseNo;
		this.sCourseTitle=sCourseTitle;
		this.iCourseDuration=iCourseDuration;
		this.sFavCourse=sFavCourse;
	}
	
	void display(){
		System.out.println("Course No :"+this.getiCourseNo());
		System.out.println("Course Title :"+this.sCourseTitle);
		System.out.println("Course Duration :"+this.iCourseDuration);
	}

	
}
