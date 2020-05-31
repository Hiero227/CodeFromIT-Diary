
public class PalCheck {
	String word;
	char[] backchar;
	int lin = word.length();
	public PalCheck(String word) {
		this.word = word;

	}

	public String Check() {
		char[] midstep = word.toCharArray();
		for (int i = 0; i <= lin; i++) {
			backchar[i] = midstep[lin];
			
			System.out.println(lin);
			lin--;
		}
		String backwards = new String(backchar);
		if (backwards.equals(word)) {
			return "This word is a palindrome";
		} else {
			return "This word is not a palindrome";
		}

	}
}
