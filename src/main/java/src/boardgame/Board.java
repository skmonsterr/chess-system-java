package src.boardgame;

/**
 *
 * @author SkM
 */
public class Board {
    
    //Encapsulation
    private int rows;
    private int columns;
    private Piece[][] pieces;
    
    //Constructors

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns]
    }
    
}
