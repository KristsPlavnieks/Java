package lv.rigacoding.school.players;
import java.util.Scanner;

import lv.rigacoding.school.game.Board;

public class HumanPlayer implements Player {

	private Scanner scanner;
	private Board board;

	public HumanPlayer(Board brd) {
		scanner = new Scanner(System.in);
		board = brd;
	}

	@Override
	public int[] makeMove() {

		System.out.println("Your move:");
		int[] rowAndColumn = inputRowAndColumn();
		int row = rowAndColumn[0];
		int column = rowAndColumn[1];

		// ja ievaditas koordinatas nav korektas prasit ievadit tik ilgi kamer ir
		// korektas
		while (!(columnAndRowInRange(row, column) && board.isMoveValid(row, column))) {

			if (!columnAndRowInRange(row, column)) {
				System.out.println("Common bro, 0-2!!!:");
			} else {
				System.out.println("Ths cell is already used!");

			}
			rowAndColumn = inputRowAndColumn(); // Prasam ievadit rindu/kolonnu
			row = rowAndColumn[0]; // Jaatjauno mainigo vertibas, pec ievades
			column = rowAndColumn[1];

		}

		// Laucins var but var nebut aizpildits - panakt to lai laucins ir tukss
		// maybe !!! ja ievaditas koordinatas nav korektas prasit ievadit tik ilgi kamer
		// ir korektas

		return rowAndColumn;
	}

	private int[] inputRowAndColumn() {
		System.out.println("Input row (0-2):");
		int row = scanner.nextInt();
		System.out.println("Input column (0-2):");
		int column = scanner.nextInt();
		return new int[] { row, column };
	}

	private boolean columnAndRowInRange(int row, int column) {
		return row >= 0 && row <= 2 && column >= 0 && column <= 2; // labais taustins, iezime funkciju , refactor -
																	// extract method !
	}

}
