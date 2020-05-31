
public class Strong {
	long number;

	public Strong(long number) {
		this.number = number;

	}

	public String getResult() {
		String strnum = String.valueOf(number);
		String[] numfield = strnum.split("(?<=.)");
		long result = 0;
		long digit;
		for (int id = 0; id < numfield.length; id++) {
			digit = Long.parseLong(numfield[id]);
			result += digit * digit * digit;

		}

		if (result == number) {

			return number + " is an armstrong number.";
		} else {
			return number + " is not an armstrong number.";
		}

	}
}
