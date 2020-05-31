
public class LCMCheck {
	long number1;
	long number2;

	public LCMCheck(long number1, long number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public String Checker() {
		long bnum = 0;
		long snum = 0;
		
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
		for (int i = 1; i <(snum*bnum); i++) {
			if (((i% bnum) == 0) && ((i % snum) == 0)) {
				return "The smallest multiple of " + snum + " and " + bnum + "  is: " + i + ".";
			} else {
				continue;
			}
		}
		return "The smallest multiple of " + snum + " and " + bnum + "  is: " + (bnum*snum) + ".";

	}
}
