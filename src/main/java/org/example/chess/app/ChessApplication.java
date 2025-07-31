package org.example.chess.app;

import org.example.chess.model.*;

import java.util.Scanner;

public class ChessApplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter piece type (KING,QUEEN,PAWN):");
        String piece=sc.next();

        System.out.println("Enter the position:");
        String positionInput= sc.next();

        try{
            ChessPieceType pieceType= ChessPieceType.valueOf(piece.toUpperCase());
            Position position= Position.fromNotation(positionInput);
            ChessPiece chessPiece;

            switch(pieceType){
                case KING -> chessPiece=new King(position);
                case QUEEN -> chessPiece=new Queen(position);
                case PAWN -> chessPiece=new Pawn(position);
                default -> throw new IllegalArgumentException("Invalid type.");
            }
            System.out.println("Possible moves are: ");
            for(Position moves:chessPiece.getPossibleMoves()){
                System.out.println(moves+" ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input "+e.getMessage());
        }
    }
}