import java.util.Scanner;

public class Mass extends History {
	public Mass() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + " Mass " + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		boolean condition = true;

		while (condition) {

			Scanner var = new Scanner(System.in);

			System.out.println("");
			System.out.println("\t\t1 - Gram\tto\tKilogram ");
			System.out.println("\t\t2 - Kilogram\tto\tGram ");
			System.out.println("\t\t3 - Milligram\tto\tKilogram ");
			System.out.println("\t\t4 - Kilogram\tto\tMilligram ");
			System.out.println("\t\t5 - Kilogram\tto\tPound ");
			System.out.println("\t\t6 - Pound\tto\tKilogram ");
			System.out.println("\t\t7 - Kilogram\tto\tTonne ");
			System.out.println("\t\t8 - Kilogram\tto\tQuintillion ");
			System.out.println("\t\t9 - Previous Menu ");

			System.out.println("");

			System.out.print("(Mass) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			switch (in) {

			case "1":
				try {
					System.out.print("Enter The Mass in grams  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Kilograms is " + gTokg(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "2":
				try {

					System.out.print("Enter The Mass in Kilograms  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Kilograms  is " + kgTog(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "3":
				try {

					System.out.print("Enter The Mass in Milligrams  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Kilograms is " + mgTokg(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "4":
				try {
					System.out.print("Enter The Mass in Kilograms  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Milligrams is " + kgTomg(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "5":
				try {
					System.out.print("Enter The Mass in Kilograms  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Pounds is " + kgTolb(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "6":
				try {
					System.out.print("Enter The Mass in Kilograms  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In kiloMeters is " + lbTokg(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "7":
				try {
					System.out.print("Enter The Mass in Tonnes  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Kilograms is " + tonTokg(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "8":
				try {
					System.out.print("Enter The Mass in Quintanls  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Kilograms is " + kgTolb(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "9":
				write("-".repeat(10));
				condition = false;
				break; // breaks the loop and ands the program execution

			default:
				System.out.println("Invalid Choice");
				System.out.println("");
				c.run();
			}
		}
	}

	private static double gTokg(double g) {
		double kg = g / 1000;
		return kg;
	}

	private static double kgTog(double g) {
		double kg = g * 1000;
		return kg;
	}

	private static double lbTokg(double g) {
		double kg = g / 2.205;
		return kg;
	}

	private static double kgTolb(double g) {
		double lb = g * 2.205;
		return lb;
	}

	private static double mgTokg(double mg) {
		double kg = mg / (Math.pow(10.0, 6.0));
		return kg;
	}

	private static double kgTomg(double mg) {
		double kg = mg * (Math.pow(10.0, 6.0));
		return kg;
	}

	private static double tonTokg(double ton) {
		double kg = ton * 1000.0;
		return kg;
	}

	private static double qntTokg(double qnt) {
		double kg = qnt * 100.0;
		return kg;
	}
}
