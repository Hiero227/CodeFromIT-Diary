
import java.util.Scanner;

public class PLatin {
	Scanner sc = new Scanner(System.in); 							//Initializing a Input class
	String vowels = "aeyiou";										//List of vowels for later use
	
	public void pLconvert() {										//Method that will convert a String typed from keyboard to PigLatin
		String input = sc.nextLine();								//Typing a word into a String
		String output = "";											//Declaring output variable
			
		if(vowels.contains(Character.toString(input.charAt(0)))) {	//Asking if first letter of input is vowel
			output = (Vowel(input));								//If it is a vowel then it is calling a Vowel method (21.row)
		}else {														
			output = (Consonant(input));							//If the first letter isn't vowel then it is calling Consonant method (26.row)
		}
		
		System.out.println(output);									//Printing converted String to console
	}
	
	private String Vowel(String in) {								//Method that will convert String with vowel as first letter into PigLatin
		return in.substring(1,in.length()) + in.charAt(0) + "hay";	//This makes from input string (for example: string) piglatin string (tring + s + hay)
	}
	
	private String Consonant(String in) {							//Method that will convert String with consonant as first letter into PigLatin
		return in.substring(1,in.length()) + in.charAt(0) + "ay";	//This makes from input string (for example: string) piglatin string (tring + s + ay)
	}

}
