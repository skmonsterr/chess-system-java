package src.boardgame;

/**
 *
 * @author SkM
 */
public class BoardException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    //Constructors
    public BoardException( String msg ) {
        super(msg);
    }
    
}