package lv.rigacoding.school.players;
import java.util.Random;

import lv.rigacoding.school.game.Board;


public class ComputerPlayer implements Player {

	private Board board;
	
	public ComputerPlayer(Board brd) {
		board = brd;
	}
	
	@Override
	public int[] makeMove() {
		
		System.out.println("Computer's move: ");
		
		
		
		// 1.Random izvelas skaitlus 0-2 prieks rindas un kollonas
		int row = new Random().nextInt(3); // 0-2
		int column = new Random().nextInt(3); // 0-2
		// 2.Parbaudit vai sis laucins ir derigs ar board.isMoveValid(), lietojot to pasu metodi no Board klases HumandPLayer
		while(!board.isMoveValid(row, column)) {
		// 3.Ja tas koordinatas neder, tad izveleties jaunus Random skaitlus
		 row = new Random().nextInt(3); 
		 column = new Random().nextInt(3); 
		}
		
		
	

		return new int[] {row, column};  // Masivs, kur 0-rinda, 1-kolonna
	}

}
