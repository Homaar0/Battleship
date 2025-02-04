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
			col1 =  Character.getNumericValue(input.charAt(1));
			row2 = input.charAt(3);
			col2 = Character.getNumericValue(input.charAt(4));
			if (row1 == row2 | col1 == col2) {
				//System.out.println("OK!");
			} else {
				System.out.println("Error!");
			}
		} catch (Exception e){
			System.out.println("Error!");
		}
		
	}

}
