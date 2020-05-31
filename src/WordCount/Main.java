import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String line, word = "";
		int count = 0, maxCount = 0;
		ArrayList<String> words = new ArrayList<String>();
		Path file2 = Paths.get("D:\\Eclipse2.0\\MostWords\\Text2.txt");
		Path file = Paths.get("D:\\Eclipse2.0\\WordCount\\Text.txt");
		BufferedReader br;
		try {
			br = Files.newBufferedReader(file2);

			while ((line = br.readLine()) != null) {
				String string[] = line.toLowerCase().split("([,.\\s]+)");
				for (String s : string) {
					words.add(s);
				}
			}

			
			System.out.println("The number of words in the text file is "+ words.size());
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

