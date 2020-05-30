package secretMessage;

import java.util.Scanner;

public class SecMess {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String input;
	String convInput = "";

	int index;
	int alphLen = alphabet.length() - 1;
	Scanner sc = new Scanner(System.in);

	String Encode() {
		input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++) {
				if (input.charAt(i) == alphabet.charAt(j)) {

					index = j;
					alphLen -= index;
					convInput += alphabet.charAt(alphLen);
					alphLen = alphabet.length() - 1;

				}
				index = 0;
			}
		}
		return convInput;
	}
}
