package _Battleship;

public enum ShipType {
	AIRCARRIER(5, "Aircraft Carrier"),
	BATTLESHIP(4, "Battleship"),
	SUBMARINE(3, "Submarine"),
	CRUISER(3, "Cruiser"),
	DESTROYER(2, "Destroyer");
		
	private final int cells;
	private final String shipName;
	
	ShipType(int cells, String shipName) {
		this.cells = cells;
		this.shipName = shipName;
	}
	
	int getCells() {
		return this.cells;
	}
	
	String getShipName() {
		return this.shipName;
	}
}
