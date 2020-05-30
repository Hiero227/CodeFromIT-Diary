import java.util.Scanner;

import javax.swing.*;

public class Check {

	Check() {
		Scanner sc = new Scanner(System.in);
		String[][] field = new String[6][6];
		String str = "";
		String s = "This is a window c:.";
		int cont = 1;
		while (cont == 1) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					field[i][j] = "-";
					field[0][0] = "a";
					field[5][5] = "b";
					str += " " + field[i][j] + " ";

					if (field[i][j] == field[i][5]) {
						str += "\n";
					}

				}
			}

			JFrame jf = new JFrame();
			JPanel jp = new JPanel();
			JPanel jp2 = new JPanel();
			JTextArea jt = new JTextArea(s);
			JTextArea jt2 = new JTextArea(str);
			jt.setEditable(false);
			jt2.setEditable(false);
			jp.add(jt);
			jp2.add(jt2);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setBounds(1100, 300, 500, 500);
			jf.add(jp);
			jf.add(jp2);
			jf.setVisible(true);
			SwingUtilities.updateComponentTreeUI(jt2);
			cont = 0;
			
		}
	}
}
