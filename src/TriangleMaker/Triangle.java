
public class Triangle {

	double sideA;
	double sideB;
	double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

	}

	public double getHeightA() {

		return Math.sqrt((sideA * sideA) - ((sideC / 2) * (sideC / 2)));
	}

	public double getArea() {

		return getHeightA() * (sideC / 2);
	}

	public double getCircumference() {
		return sideA * 2 + sideC;
	}

	public static Triangle factoryTriangle(double sideA, double sideB, double sideC) {
		if ((sideA == sideB && sideB != sideC) || (sideA != sideB && sideC == sideA)
				|| (sideC == sideB && sideC != sideA)) {

			return new Triangle(sideA, sideB, sideC);

		} else if (sideA == sideB && sideB == sideC) {

			return new Triangle(sideA, sideB, sideC);

		} else {
			return null;
		}
	}

	public String toString() {
		return sideA + " " + sideB + " " + sideC;
	}
}
