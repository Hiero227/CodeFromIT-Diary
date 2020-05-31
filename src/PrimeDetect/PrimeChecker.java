
public class PrimeChecker {
	long number;
	long divider;
	long division;

	public PrimeChecker(long number) {
		this.number = number;

	}

	public String Check() {
		for (long divider = 2; divider < number; divider++) {

			if ((number % divider) == 0) {

				return number + " is not prime number. The first number that can divide it is " + divider + ".";
			} else {
				continue;
			}

		}
		return number + " is a prime number.";
	}
}
