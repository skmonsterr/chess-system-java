package src.boardgame;

/**
 *
 * @author SkM
 */
public class Piece {
    
    //Encapsulation
    protected Position position;
    private Board board;
    
    //Constructors
    public Piece( Board board ) {
        this.board = board;
        this.position = null;
    }
    
    //Getters & Setters
    protected Board getBoard() {
        return board;
    }
}
