package org.example.chess.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class KingTest {

    @Test
    public void testKingMovesFromCenter_HasEightMoves(){
        King king= new King(new Position(4,4));
        List<Position> moves=king.getPossibleMoves();
        assertEquals(8,moves.size());
    }

    @Test
    public void testKingMoves_FromD4_ContainsC5(){
         King king= new King(new Position(3,3));
         List<Position> moves=king.getPossibleMoves();
         assertTrue(moves.contains(new Position(4,2)));
    }

    @Test
    public void testKingMoves_FromD4_DoesNotContainsE6(){
        King king= new King(new Position(3,3));
        List<Position> moves=king.getPossibleMoves();
        assertFalse(moves.contains(new Position(5,4)));
    }
}
