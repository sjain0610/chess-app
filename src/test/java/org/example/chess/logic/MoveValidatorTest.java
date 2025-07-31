package org.example.chess.logic;

import org.example.chess.model.ChessPiece;
import org.example.chess.model.King;
import org.example.chess.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveValidatorTest {

    private final MoveValidator validator = new MoveValidator();

    @Test
    public void testValidMove_ForKing() {
        ChessPiece king = new King(new Position(3, 3)); // D4
        Position to = new Position(3, 4); // E4

        boolean result = validator.isValid(king.getPosition(), to, king);
        assertTrue(result);
    }

    @Test
    public void testInvalidMove_ForKing() {
        ChessPiece king = new King(new Position(3, 3)); // D4
        Position to = new Position(5, 5); // Too far

        boolean result = validator.isValid(king.getPosition(), to, king);
        assertFalse(result);
    }

    @Test
    public void testMoveValidator_ReturnsFalse_WhenToIsSameAsFrom() {
        ChessPiece king = new King(new Position(2, 2));
        Position to = new Position(2, 2);

        boolean result = validator.isValid(king.getPosition(), to, king);
        assertFalse(result);
    }
}
