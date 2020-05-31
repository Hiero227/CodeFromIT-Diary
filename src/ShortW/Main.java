import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String line = "";
		String word = "";
		String smr = "";
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> bigger = new ArrayList<String>();
		Path file2 = Paths.get("D:\\Eclipse2.0\\MostWords\\Text2.txt");
		Path file = Paths.get("D:\\Eclipse2.0\\ShortWord\\Text.txt");
		BufferedReader br;
		try {
			br = Files.newBufferedReader(file);

			while ((line = br.readLine()) != null) {
				String string[] = line.toLowerCase().split("([,.\\s]+)");
				for (String s : string) {
					words.add(s);
				}
			}
			smr = words.get(0);
			for (int i = 0; i < words.size(); i++) {

				for (int j = i + 1; j < words.size(); j++) {

					if (smr.length() > words.get(j).length()) {
						smr = words.get(j);

					}

				}
			}
			System.out.println(
					"The shortest string in the text file is " + smr + " and is " + smr.length() + " characters long.");
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
