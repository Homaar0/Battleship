package _Battleship;

import java.util.Scanner;

public class Players {
	private BattleShips player1 = new BattleShips();
	private BattleShips player2 = new BattleShips();
	
	void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player 1, place your ships on the game field\n");
		player1.initialization();
		System.out.println("Press Enter and pass the move to another player");
		scanner.nextLine();
		System.out.println("Player 2, place your ships on the game field\n");
		player2.initialization();
		System.out.println("Press Enter and pass the move to another player");
		scanner.nextLine();
		while (!player1.isAllSunk() && !player2.isAllSunk()) {
			this.player1Move();
			scanner.nextLine();
			if (player2.isAllSunk()) {
				break;
			}
			this.player2Move();
			scanner.nextLine();
		}
	}
	
	void player1Move() {
		player2.getField().printFog();
		System.out.println("---------------------");
		player1.getField().print();
		System.out.println("Player 1, it's your turn:");
		player2.gamePlay();
		System.out.println("Press Enter and pass the move to another player");
	}
	
	void player2Move() {
		player1.getField().printFog();
		System.out.println("---------------------");
		player2.getField().print();
		System.out.println("Player 2, it's your turn:");
		player1.gamePlay();
		System.out.println("Press Enter and pass the move to another player");
	}
}
