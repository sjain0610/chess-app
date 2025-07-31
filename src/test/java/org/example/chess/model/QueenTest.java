package org.example.chess.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QueenTest {

    @Test
    public void testQueenFromD4_Has27Moves() {
        Queen queen = new Queen(new Position(3, 3)); // D4
        List<Position> moves = queen.getPossibleMoves();
        assertEquals(27, moves.size()); //in all 8 directions
    }

    @Test
    public void testQueenFromD4_ContainsH8() {
        Queen queen = new Queen(new Position(3, 3)); // D4
        List<Position> moves = queen.getPossibleMoves();
        assertTrue(moves.contains(new Position(7, 7))); // H8
    }

    @Test
    public void testQueenFromD4_ContainsD1() {
        Queen queen = new Queen(new Position(3, 3)); // D4
        List<Position> moves = queen.getPossibleMoves();
        assertTrue(moves.contains(new Position(0, 3))); // D1
    }

    @Test
    public void testQueenFromD4_DoesNotContainD4() {
        Queen queen = new Queen(new Position(3, 3));
        List<Position> moves = queen.getPossibleMoves();
        assertFalse(moves.contains(new Position(3, 3)));
    }
}
