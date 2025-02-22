package _Battleship;

import java.util.Scanner;

public class Game {
	
	boolean isRecursivelyCalled = false;
	Ship aircarrier = new Ship(ShipType.AIRCARRIER);
	Ship battleship = new Ship(ShipType.BATTLESHIP);
	Ship submarine = new Ship(ShipType.SUBMARINE);
	Ship cruiser = new Ship(ShipType.CRUISER);
	Ship destroyer = new Ship(ShipType.DESTROYER);
	
	
	void initialization() {
		Field field = new Field();
		field.print();
		placeShip(aircarrier);
		
		placeShip(battleship);
		
		placeShip(submarine);
		
		placeShip(cruiser);
		
		placeShip(destroyer);
		
	}
	
	void placeShip(Ship ship) {
		Scanner scanner = new Scanner(System.in);
		if (!isRecursivelyCalled) {
			System.out.println("Enter the coordinates of the " + ship.getType().getShipName() + " (" + ship.getType().getCells() + " cells): \n");
		} else {
			System.out.println();
		}
		String input = scanner.nextLine();
		char row1;
		int col1;
		char row2;
		int col2;
		boolean shipExist = false;
		try {
			row1 = input.charAt(0);
			col1 = input.charAt(2) == ' ' ? Character.getNumericValue(input.charAt(1)) : input.charAt(2) == '0' && input.charAt(1) == '1'? 10 : 11;			
			row2 = input.charAt(2) == ' ' ? input.charAt(3) : input.charAt(4);
			if (input.charAt(2) == ' ') {
				col2 = input.length() == 5 ? Character.getNumericValue(input.charAt(4)) : input.charAt(5) == '0' && input.charAt(4) == '1'? 10 : 11;
			} else {
				col2 = input.length() == 6 ? Character.getNumericValue(input.charAt(5)) : input.charAt(6) == '0' && input.charAt(5) == '1'? 10 : 11;
			}
			
			if ((row1 == row2 | col1 == col2) && (row1 <= 'J' && row2 <= 'J' && row1 >= 'A' && row2 >= 'A') && (col1 <= 10 && col2 <= 10 && col1 > 0 && col2 > 0)) {
				//System.out.println("OK!");
				ship.setCol1(col1);
				ship.setRow1(row1);
				ship.setCol2(col2);
				ship.setRow2(row2);
				shipExist = true;
			} else {
				System.out.println("Error!");
			}
		} catch (Exception e){
			System.out.println("Error!");
			//System.out.println("Catched exception e");
		}
		
		if (ship.checkLength()) {
			printShipData(ship);
			isRecursivelyCalled = false;
		} else if (shipExist) {
			System.out.println("Error! Wrong length of the " + ship.getType().getShipName() + "! Try again:");
			isRecursivelyCalled = true;
			placeShip(ship);
		} else {
			isRecursivelyCalled = false;
		}
				
	}
	
	void printShipData(Ship ship) {
		System.out.println("Length: " + ship.getLengthCalc());
		System.out.print("Parts: ");
		ship.printParts();
	}

}
