# chess-app
=========================

This is a simple console-based Java application to generate possible moves for selected chess pieces (King, Queen, Pawn) from a given position on the board.

-------------------------
Project Structure
-------------------------
----Main Source Code (src/main/java/org/example/chess/)

app/ – Entry point of the application
ChessApplication.java

model/ – Core chess logic
ChessPiece.java, King.java, Queen.java, Pawn.java, Position.java, ChessPieceType.java

board/ – Board setup and representation
Board.java

logic/ – Move validation logic
MoveValidator.java

----Unit Tests (src/test/java/org/example/chess/)

model/
KingTest.java, QueenTest.java, PawnTest.java, PositionTest.java

board/
BoardTest.java

logic/
MoveValidatorTest.java

How to Run
-------------------------

Option 1: Using Terminal (basic)
--------------------------------
1. Compile:
   javac -d out src/main/java/org/example/chess/app/ChessApplication.java

2. Run:
   java -cp out org.example.chess.app.ChessApplication

Option 2: Using IntelliJ or Eclipse
-----------------------------------
- Open the project
- Run ChessApplication.java as a Java application

-------------------------
Input Format
-------------------------

- Piece Type: KING, QUEEN, PAWN
- Position: A valid board square like D4, A1, H8 (case-insensitive)

-------------------------
Example
-------------------------

Enter piece type (KING, QUEEN, PAWN):
queen
Enter the position:
d4
Possible moves:
D5
D6
D7
...
H8

-------------------------
Running Tests
-------------------------

- In IntelliJ or Eclipse: Right-click test folder → Run All Tests
- If using Maven:
  mvn test

-------------------------
Features
-------------------------

- Object-Oriented design
- Move generation for King, Queen, and Pawn
- Clean console input/output
- Unit-tested code
- Maven (for dependency management)

-------------------------
TODO - Suggestions
-------------------------

- Add framework to structure data (MVC or Spring boot)
- Add Rook, Bishop, Knight
- Board with black/white tile
- User interface
