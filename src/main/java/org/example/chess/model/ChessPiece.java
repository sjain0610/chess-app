package org.example.chess.model;

import java.util.List;

public abstract class ChessPiece {

    private final Position position;

    public ChessPiece(Position position) {
        this.position = position;
    }

    public abstract List<Position> getPossibleMoves();

    public Position getPosition() {
        return position;
    }
}
