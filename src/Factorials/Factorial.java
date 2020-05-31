
public class Factorial {
	long number;

	public Factorial(long number) {
		this.number = number;
	}

	public String FactExe() {
		long result = 1;
		for (long pnum = number; pnum > 0; pnum--) {
			result *= pnum;

		}

		return "Factorial of the number " + number + " equals: " + result;
	}

}
