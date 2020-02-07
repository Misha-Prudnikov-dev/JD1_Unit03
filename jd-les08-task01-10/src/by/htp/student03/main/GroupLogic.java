package by.htp.student03.main;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	private StudentLogic stLogic = new StudentLogic();

	public List<Student> takeALevelStudents(Group group) {

		List<Student> result = new ArrayList<Student>();

		Student[] students = group.getStudents(); // извлечь из группы студентов

		for (Student st : students) {

			if (stLogic.isAStudent(st)) {

				result.add(st);

			}

		}
		return result;
	}
}
