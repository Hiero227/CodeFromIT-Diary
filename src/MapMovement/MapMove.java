import java.util.Random;

public class MapMove {
	int row;
	int column;
	char[][] map = new char[6][6];
	int count;
	String strmap = "";
	char ind = 'o';
	char mark = '+';
	char obstacle = 'x';
	char key = 'k';
	char gate = 'g';
	int rloc = 0;
	int rloc2 = 0;
	int hasKey = 0;

	Random r = new Random();

	public MapMove(int column, int row) {
		this.column = column;
		this.row = row;
	}

	public void fillMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = ind;

			}
		}

	}

	public void makeObstacles() {
		for (int i = 0; i < 10; i++) {

			rloc = r.nextInt(5);
			rloc2 = r.nextInt(5);
			map[rloc][rloc2] = obstacle;
		}
	}

	public void makeKeyAndGate() {
		for (int i = 0; i < 2; i++) {
			rloc = r.nextInt(5);
			rloc2 = r.nextInt(5);
			map[rloc][rloc2] = key;
			rloc = r.nextInt(5);
			rloc2 = r.nextInt(5);
			map[rloc][rloc2] = gate;
		}
	}

	public void makeMap() {
		strmap = "";
		count = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {

				strmap += map[i][j];
				count++;
				if (count % 6 != 0) {
					strmap += " ";
				}
				if (count % 6 == 0) {
					strmap += "\n";
				}

			}
		}

	}

	public void placePosition() {
		if (map[row][column] != obstacle) {
			map[row][column] = mark;
		}

	}

	public char[][] movePosition(String dir, int spaces) {
		switch (dir) {
		case "r":
			if (column + spaces < 6 && map[row][column + spaces] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				if (map[row][column] == 'g')

					map[row][column] = 'o';
				column += spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "l":
			if (column - spaces > -1 && map[row][column - spaces] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				column -= spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "u":
			if (row - spaces > -1 && map[row - spaces][column] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				row -= spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "d":
			if (row + spaces < 6 && map[row + spaces][column] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				row += spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "ur":
			if (column + spaces < 6 || row - spaces > -1 && map[row - spaces][column + spaces] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				column += spaces;
				row -= spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "ul":
			if (column - spaces > -1 || row - spaces > -1 && map[row - 1][column - 1] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				column -= spaces;
				row -= spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		case "dr":
			if (column + spaces < 6 || row + spaces < 6 && map[row + spaces][column + spaces] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				column += spaces;
				row += spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds or on an obstacle.");
			}
			break;
		case "dl":
			if (column - spaces > -1 || row + spaces < 6 && map[row + spaces][column - spaces] != 'x') {
				if (map[row][column] == 'k')
					hasKey += 1;
				map[row][column] = 'o';
				column -= spaces;
				row += spaces;
				map[row][column] = mark;

			} else {
				System.err.println("The result of the movement is out of bounds.");
			}
			break;
		}

		return map;
	}

}
