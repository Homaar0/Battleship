package _Battleship;

public class Cell {
	
	private char cellRow;
	private int cellCol;	
	private boolean ship = false;
	private boolean shot = false;
	private Ship shipType;
	
	public Cell(char row, int col) {
		this.cellRow = row;
		this.cellCol = col;
	}
	
	public String getCoordinants() {
		return String.valueOf(this.cellRow + this.cellCol);
	}
	
	public void setShip() {
		this.ship = true;
	}
	
	public boolean hasShip() {
		return this.ship;
	}
	
	public void shotAt() {
		this.shot = true;
	}
	
	public boolean isShot() {
		return this.shot;
	}
	
	public void setShipType(Ship ship) {
		this.shipType = ship;
	}
	
	public Ship getShipType() {
		return this.shipType;
	}
}
