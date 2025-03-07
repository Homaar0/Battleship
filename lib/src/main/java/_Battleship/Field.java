package _Battleship;

public class Field {
	
	private Cell[][] cells = new Cell[10][10];
	
	public Field() {
		this.createCells();
	}
	
	void createCells() {
		for (char i = 'A'; i <= 'J'; i++) {
			for (int j = 1; j <= 10; j++) {
				this.cells[i - 'A'][j - 1] = new Cell(i, j);
			}
		}
	}
	
	void print() {
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		for (char i = 'A'; i <= 'J'; i++) {
			System.out.print(i);
			for (int j = 1; j <= 10; j++) {
				if (!cells[i - 'A'][j - 1].hasShip() && !cells[i - 'A'][j - 1].isShot()) {
				    System.out.print(" ~");
				} else if (cells[i - 'A'][j - 1].hasShip() && !cells[i - 'A'][j - 1].isShot()){
					System.out.print(" O");
				} else if (cells[i - 'A'][j - 1].hasShip() && cells[i - 'A'][j - 1].isShot()){
					System.out.print(" X");
				} else if (!cells[i - 'A'][j - 1].hasShip() && cells[i - 'A'][j - 1].isShot()){
					System.out.print(" M");
				} 
			}
			System.out.println();
		}
	}
	
	void printFog() {
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		for (char i = 'A'; i <= 'J'; i++) {
			System.out.print(i);
			for (int j = 1; j <= 10; j++) {
				if (!cells[i - 'A'][j - 1].isShot()) {
				    System.out.print(" ~");
				} else if (cells[i - 'A'][j - 1].hasShip() && cells[i - 'A'][j - 1].isShot()){
					System.out.print(" X");
				} else if (!cells[i - 'A'][j - 1].hasShip() && cells[i - 'A'][j - 1].isShot()){
					System.out.print(" M");
				} 
			}
			System.out.println();
		}
	}
	
	void putShip(char row, int col, Ship ship) {
		cells[row - 'A'][col - 1].setShip();
		cells[row - 'A'][col - 1].setShipType(ship);
	}
	
	boolean hasShip(char row, int col) {
		return cells[row - 'A'][col - 1].hasShip();
	}
	
	void shotAt(char row, int col) {
		cells[row - 'A'][col - 1].shotAt();
	}
	
	boolean isShot(char row, int col) {
		return cells[row - 'A'][col - 1].isShot();
	}
	
	Ship getShipType(char row, int col) {
		return cells[row - 'A'][col - 1].getShipType();
	}
}
