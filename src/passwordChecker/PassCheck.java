package passwordChecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassCheck {
	String password = "";
	Pattern p = Pattern.compile("[0-9]*&&[a-z]*&&[A-Z]*");
	Matcher m;
	Scanner sc = new Scanner(System.in);
	int stop = 0;

	String checkPassword() {
		while (stop == 0) {
			System.out.println("Please enter a password: ");
			password = sc.next();
			m = p.matcher(password);
			if (m.matches() == true) {
				System.out.println("Strong");
			} else {
				System.out.println("Weak");
			}
			System.out.println("Do you want to continue ?(1/0)");
			stop = sc.nextInt();
		}
		return "";
	}
}
