package pokemon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<String> kolekce = new TreeSet<String>();
		kolekce.add("MEWTWO");
		kolekce.add("REGIGIGAS");
		kolekce.add("GARCHOMP");
		kolekce.add("PIKACHU");
		kolekce.add("CHARIZARD");
		TreeSet<String> kolekce1 = new TreeSet<String>();
		// Uloha 1
	
		File file = new File("timelog.txt");
		Path path1 = Paths.get("C:\\Users\\lukas\\Desktop\\Pokemon.txt");
		try (BufferedWriter bw = Files.newBufferedWriter(path1, Charset.forName("UTF-8"))) {

			
			for (String p : kolekce) {
				bw.write(p + ",");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		
		Path path = Paths.get(System.getProperty("user.home") + "\\Desktop\\Pokemon.txt");
		try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {

			String line = br.readLine();

			while (line != null) {
				kolekce1.add(line);
				line = br.readLine();
				
			}
			System.out.println(kolekce1);
		} catch (IOException e) {
			System.err.println(e);
		}
		// Uloha 2
		/*
		 * TreeSet<Pokemon> kolekce2 = new TreeSet<Pokemon>(); kolekce2.add(new
		 * Pokemon("MEWTWO","Genetický Pokémon")); kolekce2.add(new
		 * Pokemon("REGIGIGAS","Colossal Pokémon")); kolekce2.add(new
		 * Pokemon("GARCHOMP","Mach Pokémon")); for(Pokemon p2 : kolekce2) {
		 * System.out.println(p2.jmeno+"/"+p2.druh); }
		 */

	}

}
