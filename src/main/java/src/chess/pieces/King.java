package src.chess.pieces;

import src.boardgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

/**
 *
 * @author SkM
 */
public class King extends ChessPiece {
    
    //Constructors
    public King( Board board, Color color ) {
        super(board, color);
    }
    
    //Methods
    @Override
    public String toString() {
        return "K";
    }      
}