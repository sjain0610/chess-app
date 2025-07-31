package org.example.chess.model;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPiece {

    public Pawn(Position position) {
        super(position);
    }

    @Override
    public List<Position> getPossibleMoves() {

        List<Position> moves=new ArrayList<>();
        Position position=getPosition();

        int newRow=position.row+1;

        Position newPosition= new Position(newRow, position.column);
        if(newPosition.isValid())
            moves.add(newPosition);
        return moves;
    }
}
