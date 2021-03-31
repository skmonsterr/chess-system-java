package src.chess;

import src.boardgame.Board;
import src.chess.pieces.King;
import src.chess.pieces.Rook;

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
        initialSetup();
    }
  
    //Getters & Setters
    //Methods
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[ board.getRows() ][ board.getColumns() ];
        for( int i = 0; i < board.getRows(); i++ ) {
            for ( int j = 0; j < board.getColumns(); j++ ) {
                mat[i][j] = ( ChessPiece ) board.piece( i, j );
            }
        }
        return mat;
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece ) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    //Init Pieces in boards
    private void initialSetup() {
        placeNewPiece('b', 6, new Rook( board, Color.WHITE ));
        placeNewPiece('e', 8, new King( board, Color.BLACK ));
        placeNewPiece('e', 1, new King( board, Color.WHITE ));
        
    }
}