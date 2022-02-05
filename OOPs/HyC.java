
import java.io.*;
import java.util.*;

public class HyC extends History{

	protected static void Main() throws FileNotFoundException{

		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Hybrid Calculator" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		Scanner var = new Scanner(System.in);
		Notes not = new Notes();
		common c = new delay();

		boolean flag = false;

		boolean condition = true;


		while (condition) {

			System.out.println("");
			System.out.println("1 - Calculation");
			System.out.println("2 - Matrix");
			System.out.println("3 - Conversions");
			System.out.println("4 - History");
			System.out.println("5 - Notes");
			System.out.println("6 - Exit");

			System.out.println("");

			System.out.print("(Main Menu) >>>  ");
			char in = var.next().charAt(0);

			System.out.println("");

			switch(in){
			// checking the input value...
			case '1':
				Calculator cal = new Calculator();
				break;

			case '2':
				Matrix mat = new Matrix();
				break;

			case '3':
				Convert con = new Convert();
				break;

			case '4':
				Inteface();
				break;

			case '5':
				Scanner var2 = new Scanner(System.in);

				File file = new File("passwordManager.txt"); // opening file
	   			Scanner reader = new Scanner(file);

	   			String data = reader.nextLine();

	   			if (flag == false){

					System.out.print("Enter the Pasword  :  ");
					String password = var2.nextLine();

					if (password.equalsIgnoreCase(data)){
						flag = true;
						try {
							not.IntefaceNotes();
						}

						catch (FileNotFoundException e) {
								e.printStackTrace();
						}
					}

					else{
						System.out.println("");
						System.out.println("Access Denied, Incorrect Password !");
						System.out.println("");
						c.run();
					}

					reader.close();
				}

				else{
					try {
							not.IntefaceNotes();
						}

						catch (FileNotFoundException e) {
								e.printStackTrace();
						}
				}
				break;

			case '6':
				write("-".repeat(30));
				condition = false;
				break; // breaks the loop and ands the program execution

			default:
				System.out.println("Invalid Choice");
		}


		}

	}
}
