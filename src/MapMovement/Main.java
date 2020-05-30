
public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter a row, column and a symbol where you want to set your position.");
		MapMove mm = new MapMove(0, 3);
		mm.fillMap();
		mm.makeKeyAndGate();
		mm.makeMap();
		System.out.println(mm.strmap);
		mm.makeObstacles();
		mm.makeMap();
		System.out.println(mm.strmap);
		mm.placePosition();
		mm.makeMap();

		System.out.println(mm.strmap);
		mm.movePosition("r", 2);
		mm.makeMap();
		System.out.println(mm.strmap);
	}

}
