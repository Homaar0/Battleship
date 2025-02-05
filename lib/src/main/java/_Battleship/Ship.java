package _Battleship;

public class Ship {
	private char row1;
	private char row2;
	private int col1;
	private int col2;
	private int length;
	
	public Ship(char row1, int col1, char row2, int col2) {
		this.row1 = row1;
		this.col1 = col1;
		this.row2 = row2;
		this.col2 = col2;
		this.calculateLength();
	}
	
	void calculateLength() {
		if (this.row1 == this.row2) {
			this.length = (Math.max(this.col1, this.col2) - Math.min(this.col1, this.col2) + 1);
		} else {
			this.length = ((char) Math.max(this.row1, this.row2) - (char) Math.min(this.row1, this.row2) + 1);
		}
	}
	
	public int getLength() {
		return this.length;
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
	
}
