package _Battleship;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Field field = new Field();
		field.print();
		System.out.println("Enter the coordinates of the ship: ");
		String input = scanner.nextLine();
		char row1;
		int col1;
		char row2;
		int col2;
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
				Ship ship = new Ship(row1, col1, row2, col2);
				System.out.println("Length: " + ship.getLength());
				System.out.print("Parts: ");
				ship.printParts();
			} else {
				System.out.println("Error!");
			}
		} catch (Exception e){
			System.out.println("Error!");
			//System.out.println("Catched exception e");
		}
		
	}

}
