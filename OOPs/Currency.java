import java.util.Scanner;

public class Currency extends History {
	public Currency() {

		System.out.println("");
		System.out.println("-".repeat(10) + " " + " Currency " + " " + "-".repeat(10)); // prints the title
		System.out.println("");

		common c = new delay();

		boolean condition = true;
		while (condition) {

			Scanner var = new Scanner(System.in);

			System.out.println("");
			System.out.println("\t\t1 - INR \tto\tUSD ");
			System.out.println("\t\t2 - USD \tto\tINR ");
			System.out.println("\t\t3 - INR \tto\tEURO ");
			System.out.println("\t\t4 - EURO\tto\tINR ");
			System.out.println("\t\t5 - INR \tto\tYEN ");
			System.out.println("\t\t6 - YEN \tto\tINR ");
			System.out.println("\t\t7 - INR \tto\tDNR ");
			System.out.println("\t\t8 - DNR \tto\tINR ");
			System.out.println("\t\t9 - Previous Menu ");

			System.out.println("");

			System.out.print("(Currency) >>>  ");
			String in = var.nextLine();

			System.out.println("");

			// checking the input value...

			switch (in) {

			case "1":
				try {
					System.out.print("Enter The CURRENCY in RUPEES  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In US DOLLARS is " + inrTousd(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "2":
				try {
					System.out.print("Enter The The CURRENCY in US DOLLARS  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Rupees  is " + usdToinr(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "3":
				try {
					System.out.print("Enter The CURRENCY in RUPEES  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Euros is " + inrToeuro(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "4":
				try {
					System.out.print("Enter The CURRENCY in Euros   :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Rupees is " + euroToinr(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "5":
				try {
					System.out.print("Enter The CURRENCY in RUPEES   :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In YEN is " + inrToyen(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "6":
				try {
					System.out.print("Enter The CURRENCY in YENs   :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Rupees is " + yenToinr(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "7":
				try {
					System.out.print("Enter The CURRENCY in Rupees  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + " In Dinar is " + inrTodin(x);
					System.out.println(data);
					write(data);
					c.run();
				} catch (Exception e) {
					System.out.println("Enter only numbers");
				}
				break;

			case "8":
				try {
					System.out.print("Enter CURRENCY in Dinars  :  ");
					double x = var.nextDouble();
					System.out.println("");
					String data = x + "In Rupees is " + dinToinr(x);
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

	private static double usdToinr(double usd) {
		double inr = usd * 74.68;
		return inr;
	}

	private static double inrTousd(double inr) {
		double usd = inr / 74.68;
		return usd;
	}

	private static double euroToinr(double euro) {
		double inr = euro * 84.45;
		return inr;
	}

	private static double inrToeuro(double inr) {
		double euro = inr / 84.45;
		return euro;
	}

	private static double yenToinr(double yen) {
		double inr = yen * 0.65;
		return inr;
	}

	private static double inrToyen(double inr) {
		double yen = inr / 0.65;
		return yen;
	}

	private static double dinToinr(double din) {
		double inr = din * 0.72;
		return inr;
	}

	private static double inrTodin(double inr) {
		double din = inr / 0.72;
		return din;
	}
}
