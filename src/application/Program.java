package application;

import chess.ChassMatch;
import boardgame.Board;
import boardgame.Position;

public class Program {
	public static void main(String[] args) {
		
		ChassMatch chessMatch = new ChassMatch();
		UI.printBoard(chessMatch.getPieces());
	}
	
	
}
