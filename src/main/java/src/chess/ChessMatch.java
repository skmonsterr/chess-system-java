package src.chess;

import src.boardgame.Board;

/**
 *
 * @author SkM
 */
public class ChessMatch {

    //Encapsulation
    private Board board;

    //Constructors
    public ChessMatch() {
        board = new Board( 8, 8 );
    }
  
    //Getters & Setters
    //Methods
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for( int i = 0; i < board.getRows(); i++ ) {
            for ( int j = 0; j < board.getColumns(); j++ ) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
