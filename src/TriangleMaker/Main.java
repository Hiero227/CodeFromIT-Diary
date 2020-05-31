
public class Main {

	public static void main(String[] args) {
		Triangle t = Triangle.factoryTriangle(6.9, 4.2, 6.9);
        System.out.println(t);
        System.out.println("The area of this triangle is: " + t.getArea());
        System.out.println("The circumference of this triangle is: " + t.getCircumference());
	}

}
