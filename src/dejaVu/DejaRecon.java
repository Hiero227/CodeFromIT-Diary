package dejaVu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DejaRecon {
	Scanner sc = new Scanner(System.in);
	Pattern p = Pattern.compile(".+");
	Matcher m;
	String input;
	int stop = 0;
	int dejaVu = 0;

	String dejaVuDetect() {
		while (stop != 1) {
			System.out.println("Click enter to start");
			input = sc.nextLine();
			System.out.println("Please insert a String below: \n");

			input = sc.nextLine();
			m = p.matcher(input);
			if (m.matches()) {

				char[] cinp = new char[input.length()];

				for (int i = 0; i < input.length(); i++) {
					cinp[i] = input.charAt(i);

				}

				for (int j = 0; j < input.length(); j++) {
					for (int k = 0; k < input.length(); k++) {
						if (cinp[j] == cinp[k] && j != k) {
							dejaVu = 1;

						}
					}

				}
				if (dejaVu == 1) {
					System.out.println("Deja Vu!");
				} else {
					System.out.println("Unique!");
				}
			} else {
				System.out.println("Your input is null / unreachable.");

			}
			dejaVu = 0;
			System.out.println("Do you want to quit? (1 - yes / 0 - no)");
			stop = sc.nextInt();
		}
		return "";
	}
}
