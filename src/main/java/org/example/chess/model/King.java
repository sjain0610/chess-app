package org.example.chess.model;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPiece {
    public King(Position position) {
        super(position);
    }

    @Override
    public List<Position> getPossibleMoves() {
        int[] rows={1,1,1,0,0,-1,-1,-1};
        int[] columns={-1,0,1,-1,1,-1,0,1};

        Position position= getPosition();
        List<Position> moves=new ArrayList<>();

        for(int i=0;i<rows.length;i++) {
            int newRow = position.row + rows[i];
            int newColumn= position.column+ columns[i];

            Position newPosition=new Position(newRow,newColumn);

            if(newPosition.isValid())
                moves.add(newPosition);
        }
        return moves;
    }
}
