package _Battleship;

public enum ShipType {
	AIRCARRIER(5),
	BATTLESHIP(4),
	SUBMARINE(3),
	CRUISER(3),
	DESTROYER(2);
	
	
	private final int cells;
	
	ShipType(int cells) {
		this.cells = cells;
	}
	
	int getCells() {
		return this.cells;
	}

}
