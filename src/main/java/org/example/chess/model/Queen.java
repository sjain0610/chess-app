package org.example.chess.model;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPiece {

    public Queen(Position position) {
        super(position);
    }

    @Override
    public List<Position> getPossibleMoves() {

         int[][] DIRECTIONS = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1}, // up, down, right, left
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1} // diagonals
        };

        List<Position> moves=new ArrayList<>();

        for (int[] dir : DIRECTIONS) {
            int row = getPosition().row + dir[0];
            int col = getPosition().column + dir[1];

            while (row >= 0 && row < 8 && col >= 0 && col < 8) {
                moves.add(new Position(row, col));
                row += dir[0];
                col += dir[1];
            }
        }
        return moves;
    }
}
