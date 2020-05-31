
public class Main {

	public static void main(String[] args) {
		System.out.println("Please say what degree system you want to convert to(enter 'f' - to fahrenheit, 'c' - to celsius): ");
		FahrToCels ftc = new FahrToCels('f');
		System.out.println(ftc.convert());

	}

}
