package org.example.chess.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    private String[][] chessBoard;

    @BeforeEach
    public void setup(){
        Board board = new Board();
         chessBoard= board.getBoard();
    }

    @Test
    public void testBoardHasEightRows() {
        assertEquals(8, chessBoard.length);
    }

    @Test
    public void testEachRowHasEightColumns() {
        for (String[] row : chessBoard) {
            assertEquals(8, row.length);
        }
    }

    @Test
    public void testTopLeftTileIsA8() {
        assertEquals("A8", chessBoard[7][0]);
    }

    @Test
    public void testBottomRightTileIsH1() {
        assertEquals("H1", chessBoard[0][7]);
    }

    @Test
    public void testMiddleTileD4Position() {
        assertEquals("D4", chessBoard[3][3]);
    }

    @Test
    public void testGetTilePatternIsCorrect() {
        assertEquals("B5", chessBoard[4][1]);
    }
}