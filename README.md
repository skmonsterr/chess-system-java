## Chess System CL    [![build status](https://secure.travis-ci.org/FND/markdown-checklist.png)]() [![coverage](https://coveralls.io/repos/FND/markdown-checklist/badge.png)]()
------

### `First class: Position`
* [x] Class Position [ public ]
* [x] -> OOP Topics:
*  -> Encapsulation
*  -> Constructors
*  -> ToString ( Object / Overriding )
----

### `Starting to implement Board and Piece`
* [x] -> OOP Topics:
*  -> Associations
*  -> Encapsulation / Access Modifiers
* [x]  Data Structures Topics:
* -> Matrix
----

### `Chess layer and printing the board`
* [x] Layout

![alt text](https://i.ibb.co/4gv0Y0P/layout-chess.png "Layout")
* [x]  Methods: Board.Piece(row, column) and Board.Piece( position )
* [x]  Enum Chess.Color
* [x]  Class Chess.ChessPiece [ public ]
* [x]  Class Chess.ChessMatch [ public ]
* [x]  Class ChessConsole.UI
* [x] -> OOP Topics:
* -> Enumerations
* -> Encapsulation / Access Modifiers
* ->  Inheritance
* -> Downcasting
* -> Static members
* -> Layers pattern
* [x]  Data Structures Topics:
* -> Matrix
----

### `Placing pieces on the board`

* [ ] Method: Board.PlacePiece( piece, position )
* [ ] Classes: Rook, King [ public ] 
* [ ] Method: ChessMatch.InitialSetup
* [ ] -> OOP Topics:
* -> Inheritance
* -> Overriding
* -> Polymorphism ( ToString )
----

### `BoardException and defensive programming`
Class BoardException [public]
* [ ]  Methods: Board.PositionExists, Board.ThereIsAPiece
* [ ]  Implement defensive programming in Board methods
* [ ] ->  OOP Topics:
* -> Exceptions
* -> Constructors (a string must be informed to the exception)
----

### `ChessException and ChessPosition`
* [ ] Class ChessException [public]
* [ ] Class ChessPosition [public]
* [ ] Refactor ChessMatch.InitialSetup
* [ ] -> OOP Topics:
* -> Exceptions
* -> Encapsulation
* -> Constructors (a string must be informed to the exception)
* -> Overriding
* -> Static members
* -> Layers pattern
----

### `Little improvement in board printing`
* [ ] Class ChessException [public]
* [ ] Class ChessPosition [public]
* [ ] Refactor ChessMatch.InitialSetup
* [ ] -> OOP Topics:
* -> Exceptions
* -> Encapsulation
* -> Constructors (a string must be informed to the exception)
* -> Overriding
* -> Static members
* -> Layers pattern
----

### `Moving pieces`
* [ ] Class ChessException [public]
* [ ] Class ChessPosition [public]
* [ ] Refactor ChessMatch.InitialSetup
* [ ] -> OOP Topics:
* -> Exceptions
* -> Encapsulation
* -> Constructors (a string must be informed to the exception)
* -> Overriding
* -> Static members
* -> Layers pattern
----

### `Handling exceptions and clearing screen`
* [ ] Clear screen using Java:
* -> ChessException
* -> InputMismatchExceptioN
----
