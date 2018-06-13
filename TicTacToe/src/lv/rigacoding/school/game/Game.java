package lv.rigacoding.school.game;
import java.util.Scanner;

import lv.rigacoding.school.players.ComputerPlayer;
import lv.rigacoding.school.players.HumanPlayer;
import lv.rigacoding.school.players.Player;

public class Game {

	Player player1;
	Player player2;
	Board board;
	Scanner scanner;
	int player1Wins;
	int player2Wins;
	int draws;

	// Kaut kads parametrs ar, ko izteikt speles veidu
	// Dat pret Dat - ja - 0
	// Cilv pret Dat - ja - 1
	// Cilv pret Cilv - ja - 2

	public Game() {
		board = new Board();
		scanner = new Scanner(System.in);

		System.out.println("How many players will play? ");
		int numberOfHumanPlayers = scanner.nextInt();

		if (numberOfHumanPlayers == 0) {
			player1 = new ComputerPlayer(board);
			player2 = new ComputerPlayer(board);

		} else if (numberOfHumanPlayers == 1) {
			player1 = new HumanPlayer(board);
			player2 = new ComputerPlayer(board);

		} else {
			player1 = new HumanPlayer(board);
			player2 = new HumanPlayer(board);
		}

		player1Wins = 0;
		player2Wins = 0;
		draws = 0;

	}

	public void playGame() {

		// Pec katras partijas piedavatu spelet velreiz
		String response;
		do {
			playRound();

			System.out.println("Another game ?  Y-yes, N - No ? ");
			response = scanner.next().toUpperCase();

		} while (response.equals("Y"));

	}

	// pec katras partijas paradit kopejo rezultatu starp speletajiem
	public void playRound() {
		board.initBoard();
		board.printGameBoard();
		// kamer spele beigusies
		while (gameStatus() == GameStatus.GAME_ONGOING) {
			int[] rowAndCol0 = player1.makeMove();
			board.makeMove("X", rowAndCol0[0], rowAndCol0[1]);
			board.printGameBoard();
			// ja pirms PC gajiena spele begusies
			if (!(gameStatus() == GameStatus.GAME_ONGOING))
				break;

			int[] rowAndCol1 = player2.makeMove();
			board.makeMove("O", rowAndCol1[0], rowAndCol1[1]);
			board.printGameBoard();
			// ja kompis uzvareja break;

		}
		// Speles gala izdrukajam pazinojumu
		switch (gameStatus()) {
		case PLAYER_1_WINS:
			System.out.println("Player1 Wins!");
			player1Wins++; // katru reizi palielina + 1;
			break;
		case Player_2_WINS:
			System.out.println("Player2 Wins!");
			player2Wins++;
			break;
		case DRAW:
			System.out.println("It's a draw!");
			draws++;
			break;
		}
		System.out.println("Wins: Player1 = " + player1Wins + " Player2 = " + player2Wins + " Draws = " + draws
				+ " After " + (player1Wins + player2Wins + draws) + " games ");
	}

	private GameStatus gameStatus() {
		// , Player_2_WINS, DRAW, GAME_ONGOING;
		// Mes esam X, dators ir O
		if (board.hasPlayerWon("X"))
			return GameStatus.PLAYER_1_WINS;
		else if (board.hasPlayerWon("O")) {
			return GameStatus.Player_2_WINS;
		} else if (board.isDraw()) {
			return GameStatus.DRAW;
		} else {

		}
		return GameStatus.GAME_ONGOING;

	}
}
