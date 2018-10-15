package Assignment3_part1;
//score 5/5
public class Course {

	private String title;
	private int numberOfStudent = 0;

	Course(String title) {
		this.title = title;
	}

	Student[] students = new Student[10];

	public Student[] getStudents() {
		return students;
	}

	public boolean isFull() {
		if (this.numberOfStudent == 10)
			return true;
		else
			return false;
	}

	public int getNumberOfStudent() {
		return this.numberOfStudent;
	}

	public String getTitle() {
		return title;
	}

	public void registerStudent(Student student) {
		if (!this.isFull()) {
			students[numberOfStudent] = student;
			this.numberOfStudent++;
			System.out.println(student.getName() + " has registered to " + this.getTitle());
		}
		else
			System.out.println(student.getName() + " cannot register to " + this.getTitle() + ", because it's full");
	}

}
