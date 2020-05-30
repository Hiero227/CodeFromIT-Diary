package anadromeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AnadromeMaker {

	Scanner sc = new Scanner(System.in);
	String revin = "";

	char[] cstr;
	char[] c2str;
	String first;
	String second;
	String string1;
	String string2;

	String checkAnadrome() {
		String input = sc.next();
		if (input.length() % 2 == 0) {
			first = input.substring(0, (input.length() / 2));
			second = input.substring((input.length() / 2), input.length());
			cstr = first.toCharArray();
			c2str = second.toCharArray();
			Arrays.sort(cstr);
			Arrays.sort(c2str);
			string1 = String.valueOf(cstr);
			string2 = String.valueOf(c2str);

			if (string1.equals(string2) == true) {
				System.out.println(string1 + " " + string2);
				return "Yes.";
			}
		} else {
			first = input.substring(0, (input.length() / 2));
			second = input.substring((input.length() / 2) + 1, input.length());
			cstr = first.toCharArray();
			c2str = second.toCharArray();
			Arrays.sort(cstr);
			Arrays.sort(c2str);
			string1 = String.valueOf(cstr);
			string2 = String.valueOf(c2str);

			if (string1.equals(string2) == true) {
				System.out.println(string1 + " " + string2);
				return "Yes.";
			}
		}
		System.out.println(string1 + " " + string2);
		return "No.";
	}
}
