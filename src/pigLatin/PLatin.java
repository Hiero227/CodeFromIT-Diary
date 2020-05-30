package pigLatin;

import java.util.Scanner;

public class PLatin {
	String input = "";
	int j;
	Scanner sc = new Scanner(System.in);
	String cinput;
	String temp;

	void pLconvert() {
		input = sc.nextLine();
		String[] str = new String[input.length()];
		for (int i = 0; i < input.length(); i++) {
			str = input.split("\\s");

			temp = str[i].substring(0, 1);
			str[i] += temp + "ay";
			str[i] = str[i].substring(1);
			System.out.println(str[i]);
		}

	}
}
