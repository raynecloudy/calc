import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class calc {
	private static char[] meow = {'+', '-', '*', '/', '%', '^'};
	private static String prrow = "0.0";
	private static double prowrr = 6.626e-34;
	private static boolean hiss = true;
	private static boolean hisss = false;

	public static void main(String[] args) {
		cls();
		System.out.println("\u001b[1mwelcome to \u001b[35mrayne's \u001b[36msuper \u001b[34mcalculator\u001b[0m!!!!!");
		while (true) {
			System.out.println("enter an equation to run (or type \"info\", \"settings\" or \"quit\")");
			Scanner mroww = new Scanner(System.in);
			String nyaa = mroww.nextLine().trim().replace(" ", "");
			if (nyaa.equalsIgnoreCase("info")) {
			    cls();
			    System.out.println("\u001b[1m\u001b[35m** about hayley's super calculator *\u001b[0m*");
			    System.out.println("rayne's super calculator is program by rayne cloudy, originally created for their ap computer science class. it features a buncha cool stuff like addition (+), subtraction (-), multiplication (*), division (/), modulus (%), and exponents (^)! more features coming in the near future :3");
			    System.out.println("equation format: [num1] [operator] [num2]");
			    System.out.println("\u001b[1m\u001b[35m** environment variables **\u001b[0m");
			    System.out.println("\"ans\": the answer to the last equation ran by the calculator (if no previous equation, 0.0 is returned)");
			    System.out.println("\"c\": the speed of light in meters per second");
				System.out.println("\"e\": the mathematical constant of euler's number (approx. 2.71828)");
				System.out.println("\"h\": the mathematical constant of planck's constant (represented as 6.626e-34)");
				System.out.println("\"phi\": the mathematical constant of the golden ratio (approx. 1.61803)");
			    System.out.println("\"pi\": the mathematical constant of pi (approx. 3.14159)");
			    mroww.nextLine();
				cls();
			} else if (nyaa.equalsIgnoreCase("settings")) {
				cls();
				while (true) {
					System.out.println("\u001b[1m\u001b[35m** settings menu **\u001b[0m");
					System.out.println("\u001b[36m0 - exit settings\u001b[0m");
					System.out.println("\u001b[36m1 - recite equations (" + (hiss ? "on" : "off") + ")\u001b[0m");
					System.out.println("\u001b[36m2 - display internal java parser errors (" + (hisss ? "on" : "off") + ")\u001b[0m");
					String mrrp = mroww.nextLine().trim().replace(" ", "");
					cls();
					if (mrrp.equalsIgnoreCase("0")) {
						break;
					} else if (mrrp.equalsIgnoreCase("1")) {
						hiss = !hiss;
						notice("recite equations turned " + (hiss ? "on" : "off"));
					} else if (mrrp.equalsIgnoreCase("2")) {
						hisss = !hisss;
						notice("display internal java parser errors turned " + (hisss ? "on" : "off"));
					} else {
						error(mrrp + " is not a valid option");
					}
				}
			} else if (nyaa.equalsIgnoreCase("quit")) {
				cls();
				System.out.println("see you later");
				break;
			} else {
				try {
					String prrr = "";
					for (int i = 0; !checkoperator(nyaa.charAt(i)); i++) {
						prrr = prrr + String.valueOf(nyaa.charAt(i));
					}
					char prrrr = nyaa.charAt(prrr.length());
					String prrrrr = "";
					for (int i = prrr.length()+1; i < nyaa.length(); i++) {
						prrrrr = prrrrr + String.valueOf(nyaa.charAt(i));
					}
					cls();
					if (prrr.equalsIgnoreCase("ans")) {
						prrr = prrow;
					}
					if (prrrrr.equalsIgnoreCase("ans")) {
						prrrrr = prrow;
					}
					if (prrr.equalsIgnoreCase("c")) {
						prrr = "299792458";
					}
					if (prrrrr.equalsIgnoreCase("c")) {
						prrrrr = "299792458";
					}
					if (prrr.equalsIgnoreCase("e")) {
						prrr = "" + Math.E;
					}
					if (prrrrr.equalsIgnoreCase("e")) {
						prrrrr = "" + Math.E;
					}
					if (prrr.equalsIgnoreCase("h")) {
						prrr = "" + prowrr;
					}
					if (prrrrr.equalsIgnoreCase("h")) {
						prrrrr = "" + prowrr;
					}
					if (prrr.equalsIgnoreCase("phi")) {
						prrr = "" + ((1 + Math.sqrt(5)) / 2);
					}
					if (prrrrr.equalsIgnoreCase("phi")) {
						prrrrr = "" + ((1 + Math.sqrt(5)) / 2);
					}
					if (prrr.equalsIgnoreCase("pi")) {
						prrr = "" + Math.PI;
					}
					if (prrrrr.equalsIgnoreCase("pi")) {
						prrrrr = "" + Math.PI;
					}
					if (prrrr == '+') {
						prrow = String.valueOf(Double.valueOf(prrr) + Double.valueOf(prrrrr));
					} else if (prrrr == '+') {
						prrow = String.valueOf(Double.valueOf(prrr) + Double.valueOf(prrrrr));
					} else if (prrrr == '-') {
						prrow = String.valueOf(Double.valueOf(prrr) - Double.valueOf(prrrrr));
					} else if (prrrr == '*') {
						prrow = String.valueOf(Double.valueOf(prrr) * Double.valueOf(prrrrr));
					} else if (prrrr == '/') {
						prrow = String.valueOf(Double.valueOf(prrr) / Double.valueOf(prrrrr));
					} else if (prrrr == '%') {
						prrow = String.valueOf(Double.valueOf(prrr) % Double.valueOf(prrrrr));
					} else if (prrrr == '^') {
						prrow = String.valueOf(Math.pow(Double.valueOf(prrr), Double.valueOf(prrrrr)));
					}
					if (hiss) {
						notice(prrr + " " + prrrr + " " + prrrrr + " = " + prrow);
					} else {
						notice(prrow);
					}
				} catch (Exception mewrp) {
					cls();
					error("invalid equation format" + (hisss ? ": " + mewrp : ""));
				}
			}
		}
	}

	private static void cls() {  
		System.out.print("\033[H\033[2J\n");  
		System.out.flush();  
	}

	private static void error(String purrr) {
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		System.out.println("\u001b[1m\u001b[31m/!\\ error: " + purrr + "\u001b[0m");
	}

	private static void notice(String purrr) {
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		System.out.println("\u001b[1m\u001b[36m(i) notice: " + purrr + "\u001b[0m");
	}

	private static boolean checkoperator(char mrowr) {
		for (int i = 0; i < meow.length; i++) {
			if (mrowr == meow[i]) {
				return true;
			}
		}
		return false;
	}
}
