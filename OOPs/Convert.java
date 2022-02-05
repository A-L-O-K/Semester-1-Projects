
import java.util.Scanner;

public class Convert {

	public Convert() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + " Convert " + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		Scanner var = new Scanner(System.in);

		boolean condition = true;

		while (condition) {

			System.out.println("\t1 - Length");
			System.out.println("\t2 - Mass");
			System.out.println("\t3 - Currency");
			System.out.println("\t4 - Main Menu");

			System.out.println("");

			System.out.print("(Convert) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			switch (in){

				case "1":

					Length le = new Length();

				case "2":
					Mass m = new Mass();

				case "3":
					Currency c = new Currency();

				case "4":
					condition = false;
					break; // breaks the loop and ands the program execution


				default:
					System.out.println("Invalid Choice");
					System.out.println("");

			}
		}
	}
}
