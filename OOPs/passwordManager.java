
import java.util.*;
import java.io.*;

public class passwordManager extends HyC {

	private static void password() {
		Scanner var = new Scanner(System.in);

		System.out.println("");
		System.out.print("Create a password for Notes >>>  ");
		String password = var.nextLine();
		System.out.println("");

		if (password.length() < 5) {
			System.out.println("");
			System.out.println("Password should have minum 5 characters");
			System.out.println("");
			password();
		}

		else {
			System.out.println("");
			System.out.print("Retype your password  >>>  ");
			String password2 = var.nextLine();
			System.out.println("");

			if (password2.equals(password)) {

				try {
					File file = new File("passwordManager.txt"); // opening file
					FileOutputStream fileWriter = new FileOutputStream(file); // creating writer

					PrintWriter appender = new PrintWriter(fileWriter);

					appender.println(password);
					appender.close(); // closing the writer
				}

				catch (IOException e) {
					e.printStackTrace();
				}
			}

			else {
				System.out.println("");
				System.out.println("Password Incorrect, Try again !");
				System.out.println("");
				password();
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("passwordManager.txt"); // opening file
		Scanner reader = new Scanner(file);

		String data = reader.nextLine();

		if (data.equals("0")) {
			password();

			System.out.println("");
			System.out.println("Password set Successfully !");
			System.out.println("");
		}

		reader.close();

		Main();

	}
}
