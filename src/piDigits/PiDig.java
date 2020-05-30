package piDigits;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PiDig {
	int digit = 0;
	int nofd = 0;
	String str0 = Double.toString(Math.PI);
	String str = str0.replace(".", "");
	String sdig;
	Pattern p = Pattern.compile("[0-9]+");
	Scanner sc = new Scanner(System.in);

	String getDigit() {
		System.out.println("Please enter a position of the Pi digit that you want to know.");
		nofd += sc.nextInt();

		Matcher m = p.matcher("" + (nofd + 1));
		while (m.matches() == false || nofd == 0) {
			System.out.println("The number you entered coudn't be resolved, please try again.");
			nofd += sc.nextInt();

			m = p.matcher("" + (nofd + 1));
		}
		sdig = "" + str.charAt(nofd);
		digit += Integer.parseInt(sdig);
		return "The Pi digit on position " + nofd + " is: " + digit + ".";

	}
}
