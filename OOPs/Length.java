import java.util.Scanner;

public class Length extends History {
	public Length() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + "Convert Length" + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		boolean condition = true;

		while (condition) {

			Scanner var = new Scanner(System.in);
			System.out.println("");
			System.out.println("\t\t1 - MilliMeters\tto\tMeter ");
			System.out.println("\t\t2 - Meter\tto\tMilliMeters ");
			System.out.println("\t\t3 - CentiMeter\tto\tMeter ");
			System.out.println("\t\t4 - Meter\tto\tCentiMeter ");
			System.out.println("\t\t5 - kiloMeter\tto\tMeter ");
			System.out.println("\t\t6 - Meter\tto\tKiloMeter ");
			System.out.println("\t\t7 - Meter\tto\tFeet ");
			System.out.println("\t\t8 - Feet\tto\tMeter ");
			System.out.println("\t\t9 - Inch\tto\tMeter ");
			System.out.println("\t\t10 - Meter\tto\tInch ");
			System.out.println("\t\t11 - Previous Menu ");

			System.out.println("");

			System.out.print("(Length) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			switch (in) {

			case "1":

				try {

					System.out.print("Enter The Length in Milli Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Meters is " + mmTom(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "2":
				try {

					System.out.print("Enter The Length in Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In milliMeters is " + mTomm(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "3":
				try {

					System.out.print("Enter The Length in Centi Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Meters is " + cmTom(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "4":
				try {

					System.out.print("Enter The Length in Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In centiMeters is " + mTocm(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "5":
				try {

					System.out.print("Enter The Length in Kilo Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Meters is " + kmTom(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "6":
				try {

					System.out.print("Enter The Length in Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In kiloMeters is " + mTokm(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "7":
				try {

					System.out.print("Enter The Length in Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Feet is " + mTof(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "8":
				try {

					System.out.print("Enter The Length in Feet  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Meters is " + fTom(x);
					System.out.println(data);
					write(data);
					c.run();

				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "9":
				try {

					System.out.print("Enter The Length in inches  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Meters is " + inchTom(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "10":
				try {

					System.out.print("Enter The Length in Meters  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In inches is " + inchTom(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "11":
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

	private static double mmTom(double mm) {
		double m = mm / 1000.0;
		return m;
	}

	private static double mTomm(double mm) {
		double m = mm * 1000.0;
		return m;
	}

	private static double cmTom(double cm) {
		double m = cm / 100.0;
		return m;
	}

	private static double mTocm(double cm) {
		double m = cm * 100.0;
		return m;
	}

	private static double mTokm(double km) {
		double m = km / 1000.0;
		return m;
	}

	private static double kmTom(double km) {
		double m = km * 1000.0;
		return m;
	}

	private static double mToinch(double inch) {
		double m = inch * 39.37;
		return m;
	}

	private static double inchTom(double inch) {
		double m = inch / 39.37;
		return m;
	}

	private static double fTom(double feet) {
		double m = feet / 3.281;
		return m;
	}

	private static double mTof(double feet) {
		double m = feet * 3.281;
		return m;
	}
}
