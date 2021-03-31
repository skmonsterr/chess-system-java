package src.chess.pieces;

import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

/**
 *
 * @author SkM
 */
public class Rook  extends ChessPiece {
    
    //Constructors
    public Rook( Board board, Color color ) {
        super(board, color);
    }
    
    //Methods
    @Override
    public String toString() {
        return "R";
    }  
}