package org.example.chess.logic;

import org.example.chess.model.ChessPiece;
import org.example.chess.model.Position;

//utility class
public class MoveValidator {
    public boolean isValid(Position from, Position to, ChessPiece piece) {
        return piece.getPossibleMoves().contains(to);
    }
}