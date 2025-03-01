package _Battleship;

public class Ship {
	private char row1;
	private char row2;
	private int col1;
	private int col2;
	private int lengthCalc;
	private ShipType type;
	private boolean vertical;
	private boolean sunk = false;
	private int hitCells = 0;
	
	public Ship(char row1, int col1, char row2, int col2, ShipType type) {
		this.row1 = row1;
		this.col1 = col1;
		this.row2 = row2;
		this.col2 = col2;
		this.calculateLengthCalc();
		this.type = type;
	}
	
	public Ship(ShipType type) {
		this.type = type;
	}
	
	void setRow1(char row) {
		this.row1 = row;
	}
	
	void setCol1(int col) {
		this.col1 = col;
	}
	
	void setRow2(char row) {
		this.row2 = row;
	}
	
	void setCol2(int col) {
		this.col2 = col;
	}
	
	void calculateLengthCalc() {
		if (this.row1 == this.row2) {
			this.lengthCalc = (Math.max(this.col1, this.col2) - Math.min(this.col1, this.col2) + 1);
		} else {
			this.lengthCalc = ((char) Math.max(this.row1, this.row2) - (char) Math.min(this.row1, this.row2) + 1);
		}
	}
	
	public int getLengthCalc() {
		this.calculateLengthCalc();
		return this.lengthCalc;
	}
	
	void setVerticality() {
		if (col1 == col2) {
			vertical =true;
		} else {
			vertical = false;
		}
	}
	
	public char getRow1() {
		return this.row1;
	}
	
	public int getCol1() {
		return this.col1;
	}
	
	public char getRow2() {
		return this.row2;
	}
	
	public int getCol2() {
		return this.col2;
	}
	public ShipType getType() {
		return this.type;
	}
	
	boolean isVertical() {
		this.setVerticality();
		return this.vertical;
	}
	
	public void printParts() {
		if (this.row1 == this.row2) {
			int startCol = Math.min(this.col2, this.col1);
			int stopCol = Math.max(this.col2, this.col1);
			for (int i = startCol; i <= stopCol; i++) {
				System.out.printf("%c%d ", this.row1, i);
			}
		} else {
			char startRow = (char) Math.min(this.row2, this.row1);
			char stopRow = (char) Math.max(this.row2, this.row1);
			for (char i = startRow; i <= stopRow; i++) {
				System.out.printf("%c%d ", i, this.col1);
			}
		}
		System.out.println();
	}
		
	boolean checkLength() {
		this.calculateLengthCalc();
		if (this.type.getCells() == this.lengthCalc) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isSunk() {		
		return this.sunk;
	}
	
	void hitCell() {
		this.hitCells++;
		if (this.type.getCells() == this.hitCells) {
			this.sunk = true;
		}
	}
}
