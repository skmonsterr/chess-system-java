package src.application;

import src.chess.ChessPiece;

/**
 *
 * @author SkM
 */
class UI {
    
    //Methods
    //Print Board
    public static void printBoard( ChessPiece[][] pieces ){
        //Roam rows and columns
        for ( int i = 0; i < pieces.length; i++ ) {
            System.out.print(( 8 - i ) + " ");
            for ( int j = 0; j < pieces.length; j ++ ) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
        
    }
    
    //Print Piece
    private static void printPiece( ChessPiece piece ) {
        if ( piece == null ) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
