
package pokemon;

import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class CurrentTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		String lastline = null;
		String lastline2 = null;
		File f = new File("D:\\Eclipse2.0\\PokemonDate\\log.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line = br.readLine();
			lastline = line;
			while ((line = br.readLine()) != null) {

				lastline = line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The last time of execution is : " + lastline);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
			bw.write("\n" + year + "//" + month + "//" + day + "//" + hour + "//" + minute + "//" + second);

		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedReader br2 = new BufferedReader(new FileReader(f))) {
			String line2 = br2.readLine();
			lastline2 = line2;
			while ((line2 = br2.readLine()) != null) {

				lastline2 = line2;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] timeDivider = lastline.split("//");
		int ly = Integer.parseInt(timeDivider[0]);
		int lmo = Integer.parseInt(timeDivider[1]);
		int ld = Integer.parseInt(timeDivider[2]);
		int lh = Integer.parseInt(timeDivider[3]);
		int lm = Integer.parseInt(timeDivider[4]);
		int ls = Integer.parseInt(timeDivider[5]);
		int dy = year - ly;
		int dmo = month - lmo;
		int dd = day - ld;
		int dh = hour - lh;
		int dm = minute - lm;
		int ds = second - ls;
		int tsleis = 31557600 * dy + 2629800 * dmo + 86400 * dd + 3600 * dh + 60 * dm + ds;
		System.out.println("This program was last executed " + tsleis + " seconds ago !");

	}
}