
public class FahrToCels {
	double num;
	double result;
	char corf;

	public FahrToCels(char corf) {
		this.corf = corf;
	}

	public String convert() {
		if (corf == 'f') {
			result = (num * 9 / 5) + 32;
			return num + " in fahrenheit is: " + result;
		}
		if (corf == 'c') {
			result = (num - 32)+5/9;
			return num + " in celsius is: " + result;
		}else {
			return "Please enter 'f' or 'c'.";
		}
	}
}
