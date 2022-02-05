
import java.util.Scanner;

public class Trigonometry extends History {

	public Trigonometry() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Trignometry" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		boolean condition = true;
		while (condition) {

			Scanner var = new Scanner(System.in);

			System.out.println("");
			System.out.println("\t\t1 - Sin");
			System.out.println("\t\t2 - Cos");
			System.out.println("\t\t3 - Tan");
			System.out.println("\t\t4 - Sininv");
			System.out.println("\t\t5 - Cosinv");
			System.out.println("\t\t6 - Taninv");
			System.out.println("\t\t7 - Previous Menu");

			System.out.println("");

			System.out.print("(Trignometry) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			switch (in) {

			case "1":

				System.out.print("Enter The angle (Degree) :  ");
				double x1 = var.nextDouble();
				System.out.println("");
				sin(x1);
				c.run();
				break;

			case "2":

				System.out.print("Enter The angle (Degree) :  ");
				double x2 = var.nextDouble();
				System.out.println("");
				cos(x2);
				c.run();
				break;

			case "3":

				System.out.print("Enter The angle (Degree) :  ");
				double x3 = var.nextDouble();
				System.out.println("");
				tan(x3);
				c.run();
				break;

			case "4":

				System.out.print("Enter The value  :  ");
				double x4 = var.nextDouble();
				System.out.println("");
				sininv(x4);
				c.run();
				break;

			case "5":

				System.out.print("Enter The value  :  ");
				double x5 = var.nextDouble();
				System.out.println("");
				cosinv(x5);
				c.run();
				break;

			case "6":

				System.out.print("Enter The value  :  ");
				double x6 = var.nextDouble();
				System.out.println("");
				taninv(x6);
				c.run();
				break;

			case "7":
				write("-".repeat(10));
				condition = false; // breaks the loop and ands the program execution
				break;

			default:
				System.out.println("Invalid Choice");
				System.out.println("");
				c.run();

			}
		}
	}

	private static void sin(double num) {
		String data = "Sin(" + num + ") = " + Math.sin(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	private static void cos(double num) {
		String data = "Cos(" + num + ") = " + Math.cos(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	private static void tan(double num) {
		String data = "Tan(" + num + ") = " + Math.tan(num * Math.PI / 180);
		System.out.println(data);
		write(data);
	}

	private static void sininv(double num) {
		String data = "Sininv(" + num + ") = " + (Math.asin(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}

	private static void cosinv(double num) {
		String data = "Cosinv(" + num + ") = " + (Math.acos(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}

	private static void taninv(double num) {
		String data = "Taninv(" + num + ") = " + (Math.atan(num) * (180 / Math.PI)) + "\u00B0";
		System.out.println(data);
		write(data);
	}
}
