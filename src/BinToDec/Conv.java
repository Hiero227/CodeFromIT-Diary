import java.util.ArrayList;

public class Conv {
	
	int bnum;
	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	int j = 0;
	String snum = Integer.toString(bnum);
	char[] al = snum.toCharArray();
	ArrayList<Character> sa = new ArrayList<Character>();
	ArrayList<Character> rsa = new ArrayList<Character>();

	public ArrayList<Character> FillArr() {
		for (int h = 0; h < al.length; h++) {
			sa.add(al[h]);
		}
		return sa;

	}

	public Conv(int bnum) {
		this.bnum = bnum;
	}

	public String DecConv() {
        int dnum = 0;
        
		for (int a = sa.size() - 1; a >= 0; a--) {

			rsa.add(sa.get(a));

		}
		for (int e = 0; e < rsa.size(); e++) {
			if (rsa.get(e) == '2'||rsa.get(e) == '3'||rsa.get(e) == '4'||rsa.get(e) == '5'||rsa.get(e) == '6'||rsa.get(e) == '7'||rsa.get(e) == '8'||rsa.get(e) == '9') {
				return "The number you entered is a non-binary number.";
			}
		}

		for (int i = 0; i < rsa.size(); i++) {
             if(rsa.get(i)=='1') {
			
				dnum = dnum +(int) Math.pow(2, i);
             }
		}
		return "The decimal version of number " + bnum + " is " + dnum + "";
	}

}
