package cmdLineInterpreter;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import onlineTest.SystemManager;

/**
 * 
 * By running the main method of this class we will be able to execute commands
 * associated with the SystemManager. This command interpreter is text based.
 *
 */
public class Interpreter {

	public static void main(String[] args) throws Exception {
		SystemManager manager = new SystemManager();

		int choice = 6;
		Scanner sc = new Scanner(System.in);

		do {
			String menu = "Enter 1 to add a student\n";
			menu += "Enter 2 to add an exam\n";
			menu += "Enter 3 to add a true/false question\n";
			menu += "Enter 4 to answer a true/false question\n";
			menu += "Enter 5 to get the exam score for a student\n";
			menu += "Enter 6 to quit-->";
			System.out.print(menu);
			choice = sc.nextInt();
			sc.nextLine();

			String studentName = null;

			switch (choice) {
			case 1:
				System.out.print("Enter the student name-->");
				studentName = sc.nextLine();
				manager.addStudent(studentName);
				break;
			case 2:
				System.out.print("Enter the exam ID-->");
				int examId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the exam title-->");
				String title = sc.nextLine();
				manager.addExam(examId, title);
				break;
			case 3:
				System.out.print("Enter the exam ID-->");
				int id1 = sc.nextInt();
				System.out.print("Enter the questionNumber-->");
				int questionNumber = sc.nextInt();
				System.out.print("Enter the question content-->");
				String text = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter the question points-->");
				double points = sc.nextDouble();
				System.out.print("Enter the question answer-->");
				boolean answer = sc.nextBoolean();
				manager.addTrueFalseQuestion(id1, questionNumber, text, points, answer);
				break;
			case 4:
				System.out.print("Enter the student name-->");
				String name = sc.nextLine();
				System.out.print("Enter the exam ID-->");
				int examId1 = sc.nextInt();
				System.out.print("Enter the question number-->");
				int questionNumber1 = sc.nextInt();
				System.out.print("Enter the answer-->");
				boolean answer1 = sc.nextBoolean();
				manager.answerTrueFalseQuestion(name, examId1, questionNumber1, answer1);
				break;
			case 5:
				System.out.print("Enter the student name-->");
				String name1 = sc.nextLine();
				System.out.print("Enter the exam ID-->");
				int id = sc.nextInt();
				System.out.println(manager.getExamScore(name1, id));
				break;
			}

		} while (choice != 6);

	}
}
