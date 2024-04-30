package mahaboob.com23CipherbyteTechnologies;

import java.util.Scanner;

public class OnlineExamination {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExamSystem examSystem = new ExamSystem();

		System.out.println("Welcome to Online Examination System");

		while (true) {
			System.out.println("\n1. Login");
			System.out.println("2. Update Profile and Password");
			System.out.println("3. Select Answers for MCQs");
			System.out.println("4. Start Exam");
			System.out.println("5. Logout");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter username: ");
				String username = scanner.nextLine();
				System.out.print("Enter password: ");
				String password = scanner.nextLine();
				examSystem.login(username, password);
				break;
			case 2:
				examSystem.updateProfile();
				break;
			case 3:
				examSystem.selectAnswers();
				break;
			case 4:
				examSystem.startExam();
				break;
			case 5:
				examSystem.logout();
				scanner.close();
				System.out.println("Logout successful. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}


