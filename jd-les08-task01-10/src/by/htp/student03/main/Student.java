package by.htp.student03.main;

public class Student {

	private String surname;
	private String initials;
	private int numGroup;
	private int[] marks;

	public Student(String surname, String initials, int numGroup, int[] marks) {
		this.surname = surname;
		this.initials = initials;
		this.numGroup = numGroup;
		this.marks = marks;
	}

	public void setSurname(String surname) {
		this.surname = surname;

	}

	public String getSurname() {

		return surname;
	}

	public void setInitials(String initials) {
		this.initials = initials;

	}

	public String getInitials() {

		return initials;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;

	}

	public int getNumGroup() {

		return numGroup;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;

	}

	public int[] getMarks() {

		return marks;
	}

	

}
