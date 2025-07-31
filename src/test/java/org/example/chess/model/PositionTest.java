package org.example.chess.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    //isValid function
    @Test
    public void testIsValid_rowColumn(){
        Position position=new Position(4,5);
        assertTrue(position.isValid());
    }

    @Test
    public void testInvalidNegativeRow(){
        Position position=new Position(-1,5);
        assertFalse(position.isValid());
    }

    @Test
    public void testInvalidColumnBeyondBoard() {
        Position p = new Position(1, 8);
        assertFalse(p.isValid());
    }

    //fromNotation function
    @Test
    public void testFromNotation_ThrowsException_WhenTooLong() {
        assertThrows(IllegalArgumentException.class, () -> Position.fromNotation("A10"));
    }

    @Test
    public void testFromNotation_ThrowsException_WhenTooShort(){
        assertThrows(IllegalArgumentException.class, ()-> Position.fromNotation(("B")));
    }

    @Test
    public void testFromNotation_ValidLowerCase() {
        Position position = Position.fromNotation("e4");
        assertEquals(new Position(3, 4), position);
    }

    @Test
    public void testFromNotation_ValidUpperCase() {
        Position position = Position.fromNotation("D1");
        assertEquals(new Position(0, 3), position);
    }

    @Test
    public void testFromNotation_InvalidRowOutOfBounds() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> Position.fromNotation("E9"));
        assertTrue(e.getMessage().contains("Position out of bounds"));
    }

    @Test
    public void testFromNotation_InvalidColumnOutOfBounds() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> Position.fromNotation("Z1"));
        assertTrue(e.getMessage().contains("Position out of bounds"));
    }

    // --- toNotation() ---

    @Test
    public void testToNotation_A1() {
        Position position = new Position(0, 0);
        assertEquals("A1", position.toNotation());
    }

    // --- equals and hashCode ---

    @Test
    public void testEquals_TrueForSamePosition() {
        Position a = new Position(2, 3);
        Position b = new Position(2, 3);
        assertEquals(a, b);
    }

    @Test
    public void testEquals_FalseForDifferentPosition() {
        Position a = new Position(2, 3);
        Position b = new Position(3, 2);
        assertNotEquals(a, b);
    }

    @Test
    public void testHashCode_EqualForSameCoordinates() {
        Position a = new Position(1, 5);
        Position b = new Position(1, 5);
        assertEquals(a.hashCode(), b.hashCode());
    }
}