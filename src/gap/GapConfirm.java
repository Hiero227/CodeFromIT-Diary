package gap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GapConfirm {
	boolean valid;
	int first;
	int last;
	String gapnum;
	Pattern p = Pattern.compile("[0-9]{3,}");
	Scanner sc = new Scanner(System.in);
	Matcher m;
	int num1;
	int num2;
	String divider = "";
	int dividable;
	boolean cont;
	double vysledek;

	String checkGap() {
		System.out
				.println("Before you start insert any key.\nPlease enter a number that is has at least three digits. ");
		while (cont = true) {
			gapnum = sc.next();
			while (valid != true) {
				gapnum = sc.next();
				m = p.matcher(gapnum);
				if (m.matches()) {
					valid = true;
				} else
					System.out.println("Please try again.");
			}
			num1 = Integer.parseInt(gapnum);
			last = gapnum.length();
			divider += gapnum.substring(0, 1) + gapnum.substring(last - 1, last);
			num2 = Integer.parseInt(divider);
			vysledek = Math.ceil(num1 / num2);
			System.out.println(num1 + " / " + num2 + " = " + vysledek);
			if (num1 % num2 == 0) {
				System.out.println("The entered number is a gap number.");
			} else
				System.out.println("The entered number isn't a gap number.");
			divider = "";
			System.out.println("Try another number ?");
			cont = sc.nextBoolean();
		}
		return "";
	}
}
