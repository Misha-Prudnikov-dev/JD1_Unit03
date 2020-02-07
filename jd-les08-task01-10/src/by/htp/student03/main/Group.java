package by.htp.student03.main;

public class Group {

	private int realGroupSize;
	private Student[] students;

	public Group(int number) {
		students = new Student[number];
		realGroupSize = 0;
	}

	public boolean add(Student newStudent) {
		if (realGroupSize >= students.length) {
			return false;
		}

		students[realGroupSize] = newStudent;
		realGroupSize++;
		return true;
	}

	public void setStudents(Student[] students) {
		this.students = students;

	}

	public Student[] getStudents() {

		return students;

	}
}
