
public class LCDCheck {
	long number1;
	long number2;

	public LCDCheck(long number1, long number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public String Checker() {
		long bnum = 0;
		long snum = 0;
		long samenum = 0;
		if (number1 < number2) {
			bnum = number2;
			snum = number1;
		} else if (number1 > number2) {
			snum = number2;
			bnum = number1;
		} else {
			bnum = number1;
			snum = number1;
		}
		for (int i = 2; i <= snum; i++) {
			if ((((bnum % i) == 0) && ((snum % i) == 0))) {
				return "The smallest number able to divide " + snum + " and " + bnum + " with no remainder is: " + i +".";
			} else {
				continue;
			}
		}
		return "The numbers "+ snum +" and "+ bnum + " have no common divider without remainder.";
	}
}
