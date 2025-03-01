package _Battleship;


import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Players game = new Players();
		game.play();
		scanner.close();
		System.exit(0);
	}
}
