package in.ac.kletech;

public class StudentDemo {
	public static void main(String[] args) {
		Student Sindhu = new Student(306, "Sindhu", 3);
		Sindhu.regCourses(1, "CS", 6, true);
		Sindhu.regCourses(2, "EC", 7, true);
		Sindhu.regCourses(3, "EC", 8, false);
		Sindhu.regCourses(4, "EC", 9, true);

		//Sindhu.view();
		System.out.println("Fav Course is : "+Sindhu.FavCourse());
	}
}
