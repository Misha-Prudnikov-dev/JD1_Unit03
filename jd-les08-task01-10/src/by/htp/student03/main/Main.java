package by.htp.student03.main;

import java.util.List;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {

	public static void main(String[] args) {

		GroupLogic grLogic = new GroupLogic();
		Group group = new Group(10);

		group.add(new Student("Verner", "Y.N", 214, new int[] { 8, 6, 7, 3, 9 }));
		group.add(new Student("Starostin", "V.G", 214, new int[] { 6, 6, 7, 5, 9 }));
		group.add(new Student("Podobed", "O.S", 214, new int[] { 3, 2, 4, 7, 6 }));
		group.add(new Student("Varlamov", "M.D", 214, new int[] { 9, 10, 9, 10, 9 }));
		group.add(new Student("Aksenov", "D.F", 214, new int[] { 7, 6, 7, 5, 9 }));
		group.add(new Student("Panasenko", "N.K", 214, new int[] { 10, 9, 9, 10, 9 }));
		group.add(new Student("Korzh", "M.A", 214, new int[] { 6, 6, 7, 6, 8 }));
		group.add(new Student("White", "N.H", 214, new int[] { 9, 6, 6, 6, 8 }));
		group.add(new Student("Garbuzova", "V.D", 214, new int[] { 2, 2, 9, 9, 9 }));
		group.add(new Student("Tereshkova", "V.N", 214, new int[] { 7, 6, 7, 5, 9 }));

		List<Student> aLevelStudents;
		aLevelStudents = grLogic.takeALevelStudents(group);

		printAStudent(aLevelStudents);

	}

	public static void printAStudent(List<Student> aLevelStudents) {

		for (Student st : aLevelStudents) {

			System.out.println("_________________");
			System.out.println(st.getSurname() + " " + st.getInitials() + "    ");

			for (int i = 0; i < st.getMarks().length; i++) {
				System.out.print(st.getMarks()[i] + "  ");
			}
			System.out.println("");
		}
	}

}
