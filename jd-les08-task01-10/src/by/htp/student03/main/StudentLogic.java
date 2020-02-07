package by.htp.student03.main;

public class StudentLogic {

	public boolean isAStudent(Student st) {
		int[] marks;

		marks = st.getMarks();

		for (int mark : marks) {
			if (mark < 9) {
				return false;
			}

		}
		return true;
	}

}
