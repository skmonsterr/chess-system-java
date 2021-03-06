package src.chess;

import src.boardgame.Board;
import src.boardgame.Piece;

/**
 *
 * @author SkM
 */
public class ChessPiece extends Piece {
    
    //Encapsulation
    private Color color;
    
    //Constructors
    public ChessPiece( Board board, Color color ) {
        super( board );
        this.color = color;
    }
    
    //Getters & Setters
    public Color getColor() {
        return color;
    } 
}