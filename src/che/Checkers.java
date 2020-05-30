package che;

import java.util.Scanner;

public class Checkers {
	String[][] pole = new String[8][8];
	int winner = 0;
	Scanner sc = new Scanner(System.in);
	String spole = "";
	int stop = 0;

	String playCheckers() {
		while (stop == 0) {
			while (winner == 0) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						pole[i][j] = " o";
						if (j % 8 == 0) {
							spole += "\n";
						}
						spole += pole[i][j];

					}
				}
				System.out.println("Please pick which one you want to move.");
				System.out.println(spole);
			}

			System.out.println("Do you want to quit ?");
			stop = sc.nextInt();
		}
		return "";
	}
}
