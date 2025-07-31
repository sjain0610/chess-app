package org.example.chess.model;

import java.util.Objects;

//utility class
public class Position {

    public final int row;
    public final int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean isValid(){
        return row>=0 && row<8 && column>=0 && column<8;
    }

    public static Position fromNotation(String notation){
        if(notation.length() != 2){
            throw new IllegalArgumentException("Invalid notation: " + notation);
        }
        char NotationColumn = Character.toUpperCase(notation.charAt(0)); // To get the column character, e.g., 'A', 'B'.
        int NotationRow = Character.getNumericValue(notation.charAt(1));

        int row=NotationRow-1;
        int column=NotationColumn-'A';

        Position position=new Position(row,column);

        if (!position.isValid())
            throw new IllegalArgumentException("Position out of bounds: " + notation);
        return position;
    }

    public String toNotation() {
        return "" + (char) ('A' + column) + (row + 1);
    }

    @Override
    public String toString() {
        return toNotation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Position)) return false;
        Position position = (Position) obj;
        return row == position.row && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
