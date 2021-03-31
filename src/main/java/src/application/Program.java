package src.application;

import src.chess.ChessMatch;

/**
 *
 * @author SkM
 */
public class Program {

    public static void main(String[] args) {
        
       ChessMatch chessMatch = new ChessMatch();
       UI.printBoard(chessMatch.getPieces());
    }
}