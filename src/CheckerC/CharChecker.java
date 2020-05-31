import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CharChecker {
	char c;
	char c1;
	char bc;
	char srw[];
	String line = "";
	int count = 0;
	String s;
	int a;
	ArrayList<String> word = new ArrayList<String>();
	Path path = Paths.get("D:\\Eclipse2.0\\CharC\\Text2.txt");

	public CharChecker() {

	}

	public String Check() {
		try {
			BufferedReader br = Files.newBufferedReader(path);

			while ((line = br.readLine()) != null) {

				s = line.toLowerCase();
			}
			srw = s.toCharArray();
			for (int i = 0; i < srw.length; i++) {
                
				if((c=srw[i])==srw[i]) {
					count++;
				}
				
			}

		} catch (IOException e) {

		}
		return "The character " + c + " is the most frequent and appears " + count + " times.";
	}

}
