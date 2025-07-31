package org.example.chess.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test
    public void testPawn_movesOneStep(){
        Pawn pawn=new Pawn(new Position(3,3));
        List<Position> moves=pawn.getPossibleMoves();
        assertEquals(1,moves.size());
    }

    @Test
    public void testPawn_fromD4_canGoToD5(){
        Pawn pawn=new Pawn(new Position(3,3));
        List<Position> moves=pawn.getPossibleMoves();
        assertTrue(moves.contains(new Position(4,3)));
    }

    @Test
    public void testPawn_fromD4_cannotGoToD3(){
        Pawn pawn=new Pawn(new Position(3,3));
        List<Position> moves=pawn.getPossibleMoves();
        assertFalse(moves.contains(new Position(2,3)));
    }
}
