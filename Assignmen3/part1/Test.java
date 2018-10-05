package Assignment3_part1;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student("student1", 1);
		Student student2 = new Student("student2", 2);
		Student student3 = new Student("student3", 3);
		Student student4 = new Student("student4", 4);
		Student student5 = new Student("student5", 5);
		Student student6 = new Student("student6", 6);
		Student student7 = new Student("student7", 7);
		Student student8 = new Student("student8", 8);
		Student student9 = new Student("student9", 9);
		Student student10 = new Student("student10", 10);
		Student student11 = new Student("student11", 11);
		System.out.println(student1.getName() + "'s student id is " + student1.getId());
		System.out.println("------------------------------------------");

		Course c1 = new Course("Calculus");
		Course c2 = new Course("statistics");
		Course c3 = new Course("topology");
		Course[] courses = new Course[3];
		courses[0] = c1;
		courses[1] = c2;
		courses[2] = c3;
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses[i].getTitle() + " has " + courses[i].getNumberOfStudent() + " students registered in ");
		}
		System.out.println("------------------------------------------");

		c1.registerStudent(student1);
		c1.registerStudent(student3);
		c1.registerStudent(student5);
		c1.registerStudent(student7);
		c2.registerStudent(student2);
		c2.registerStudent(student4);
		c2.registerStudent(student6);
		c2.registerStudent(student8);
		c2.registerStudent(student10);
		c3.registerStudent(student11);
		c3.registerStudent(student9);
		c3.registerStudent(student3);
		c3.registerStudent(student5);
		System.out.println("------------------------------------------");

		for (int i = 0; i < courses.length; i++) {
			if (courses[i].getNumberOfStudent() == 10) {
				System.out.println(courses[i].getTitle() + " is full ");
			}
			else {
				System.out.println(courses[i].getTitle() + " has " + courses[i].getNumberOfStudent() +" students in it, it's not full ");
			}
		}
		System.out.println("------------------------------------------");

		for (int i = 0; i < c2.getStudents().length && c2.getStudents()[i] != null; i++) {
			System.out.println(c2.getTitle() + " has " + c2.getStudents()[i].getName() + " students registered in ");
		}
	}
}
