package lv.rigacoding.school.game;
// Klase, kur glabat speles laukuma stavokli
public class Board {

	String[][] gameBoard;

	public Board() {

		gameBoard = new String[][] { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
	}

	// Metode, lai iztiritu laukumu
	public void initBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				gameBoard[i][j] = " ";
			}
		}
	}

	// Izdrukat speles stavokli konsole saprotama forma
	public void printGameBoard() {

		// ka panemt gameBoard un izprintet
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				System.out.print("|" + gameBoard[i][j]);
			}
			System.out.println("|");

		}
	}

	// Ierakstit gajiena vertibu (x vai o uz lauka)
	// str bus vainu x vai o
	// row - rinda (0-2)
	// column - kolonna (0-2)

	public void makeMove(String str, int row, int column) {
		// Mainit konkreta massiva elementa saturu
		gameBoard[row][column] = str;
	}
	// Parbaudit vai ir iespejams veikt gajienu noteikta lauka pozicija

	// Ja laucins ir tuks true, ja ne tad false
	public boolean isMoveValid(int row, int column) {

		return gameBoard[row][column].equals(" ");
	}

	public boolean hasPlayerWon(String symbol) {
		// izmantojot metodes apaksa nosaka vai speletajs ir uzvarejis vai ne
		// japarbauda visi iespejamie 8 varianti
		// ja kaut viens atgriezis true - speletajs uzvarejis.
		return isRowWinning(0, symbol) || isRowWinning(1, symbol) || isRowWinning(2, symbol)
				|| isColumnWinning(0, symbol) || isColumnWinning(1, symbol) || isColumnWinning(2, symbol)
				|| isDiognalWinning(symbol);
	}
	// True ja visi laucini ir aiznemti
	// False ja kads ir brivs

	public boolean isDraw() {

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				if (gameBoard[i][j].equals(" ")) {
					// Ja vismaz viens laucins nav aizpildits
					return false;
				}
			}
		}
		return true;
	}

	// Row 0-2, symbol ( X, O )
	private boolean isRowWinning(int row, String symbol) {
		return gameBoard[row][0].equals(symbol) && gameBoard[row][1].equals(symbol) && gameBoard[row][2].equals(symbol);
	}

	private boolean isColumnWinning(int column, String symbol) {
		return gameBoard[0][column].equals(symbol) && gameBoard[1][column].equals(symbol)
				&& gameBoard[2][column].equals(symbol);
	}

	private boolean isDiognalWinning(String symbol) {
		return (gameBoard[0][0].equals(symbol) && gameBoard[1][1].equals(symbol) && gameBoard[2][2].equals(symbol)
				|| (gameBoard[2][0].equals(symbol) && gameBoard[1][1].equals(symbol)
						&& gameBoard[0][2].equals(symbol)));
	}

}
