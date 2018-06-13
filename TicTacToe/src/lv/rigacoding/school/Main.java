package lv.rigacoding.school;

import lv.rigacoding.school.game.Game;

public class Main {

	public static void main(String[] args) {
		
		new Game().playGame();
		
		/*
		Board board = new Board();
		HumanPlayer p1 = new HumanPlayer(board);
		ComputerPlayer c = new ComputerPlayer(board);
		
		board.printGameBoard();
			
	
		
		
		
		// Izsauc funkciju kura prasis rindu/ colonu ievadit kamer bus korektas koordinatas
		int[] coordinates = p1.makeMove();	
		// 0-rinda, 1-kolonna
		board.makeMove("X", coordinates[0], coordinates[1]);
		board.printGameBoard();
		
		coordinates = c.makeMove();
		board.makeMove("O", coordinates[0], coordinates[1]);
		board.printGameBoard();
	
	*/
	}
	
}
