import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JPanel;

public class TTTmaker {
	char p1 = 'x';
	char p2 = 'o';
	String st = "";
	int cont;
	char[][] space = new char[4][4];
	Scanner sc = new Scanner(System.in);
	int winner = 0;
	int a = 2;
	int i1;
	int i2;
	double v;
	int valid = 1;
	int i = 0;
	StringBuilder sb = new StringBuilder();
	Pattern p = Pattern.compile("[0-2]");
	Pattern secret = Pattern.compile("tf2");

	public void fillSpace() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				space[i][j] = '-';

			}
		}
	}

	public int Play() {
		
		cont = 1;
	
		if (i > 0) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					space[i][j] = '-';

				}
			}
		}
		while (cont == 1) {
			while (winner == 0) {
		String s = sc.next();	
				if (a % 2 == 0) {
					System.out.println("Player with symbol 'o', enter coordinates.");

					do {

						v = 0;
						String st = sc.next();
						Matcher m = p.matcher(st);
						Matcher m1 = secret.matcher(st);
						if (m1.matches()) {

							System.out.println("You got the secret insta-win!");

							return a;
						} else if (m.matches() == false) {

							valid = 0;
							System.out.println("Entered coordinates are taken, or invalid.");
						} else if (m.matches()) {
							v += 0.5;
							i1 = Integer.parseInt(st);
						}
						String st2 = sc.next();
						m = p.matcher(st2);
						if (m.matches() == false) {
							valid = 0;
							System.out.println("Entered coordinates are taken, or invalid.");
						} else if (m.matches()) {

							v += 0.5;
							i2 = Integer.parseInt(st2);
						}

					} while (valid == 0 || space[i1][i2] == 'x' || space[i1][i2] == 'o' || v != 1.0);
					space[i1][i2] = 'o';
					valid = 1;
				} else {
					System.out.println("Player with symbol 'x', enter coordinates.");

					do {
						v = 0;
						String st = sc.next();
						Matcher m = p.matcher(st);
						Matcher m1 = secret.matcher(st);
						if (m1.matches()) {

							System.out.println("You got the secret insta-win!");

							return a;
						} else if (m.matches() == false) {
							System.out.println("Entered coordinates are taken, or invalid.");
							valid = 0;
						} else if (m.matches()) {
							v += 0.5;
							i1 = Integer.parseInt(st);
						}
						String st2 = sc.next();
						m = p.matcher(st2);
						if (m.matches() == false) {
							valid = 0;
							System.out.println("Entered coordinates are taken, or invalid.");
						} else if (m.matches()) {
							i2 = Integer.parseInt(st2);
							v += 0.5;
						}

					} while (space[i1][i2] == 'x' || space[i1][i2] == 'o' || valid == 0 || i1 == 5 || i2 == 5
							|| v != 1.0);
					space[i1][i2] = 'x';
					valid = 1;
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (j % 4 == 0) {
							st += "\n";
						}
						st += space[i][j];
					}
				}
				System.out.println(st);
				for (int i = 0; i < 4; i++) {

					if (((space[i][1]) == (space[i][2]) && ((space[i][1] == space[i][0]) || space[i][1] == space[i][3]))
							&& space[i][0] != '-') {
						if (space[i][1] == 'x') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'x' wins!");
						}
						if (space[i][1] == 'o') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'o' wins!");
						}
					}

					if (((space[1][i]) == (space[2][i]) && ((space[1][i]) == (space[0][i]))
							|| space[1][i] == space[3][i]) && space[0][i] != '-') {
						if (space[1][i] == 'x') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'x' wins!");
						}
						if (space[1][i] == 'o') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'o' wins!");
						}

					}
					if ((space[1][1] == space[2][2] && (space[1][1] == space[0][0] || space[1][1] == space[3][3]))
							|| ((space[0][1] == space[1][2]) && (space[0][1] == space[2][3]))
							|| ((space[1][0] == space[2][1]) && (space[1][0] == space[3][2])) && space[0][0] != '-') {
						if (space[1][1] == 'x') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'x' wins!");
						}
						if (space[1][1] == 'o') {
							winner = 1;
							System.out.println(st);
							System.out.println("Player with 'o' wins!");
						}
					}
				}
				if ((space[1][2] == space[2][1] && (space[1][2] == space[3][0] || space[1][2] == space[0][3]))
						|| ((space[0][2] == space[1][1]) && (space[0][2] == space[2][0]))
						|| ((space[1][3] == space[2][2]) && (space[1][3] == space[3][1])) && space[0][2] != '-') {
					if (space[1][2] == 'x') {
						winner = 1;
						System.out.println(st);
						System.out.println("Player with 'x' wins!");
					}
					if (space[1][2] == 'o') {
						winner = 1;
						System.out.println(st);
						System.out.println("Player with 'o' wins!");
					}
				}
				i++;
				a++;
			}
			System.out.println("Do you wish to play again ?(1/0)");
			cont = sc.nextInt();
			if (cont == 1) {
				winner = 0;
			}
			
		

		}
		return a;
	}
}
