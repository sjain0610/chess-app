package org.example.chess.board;

public class Board {
    String[][] chessBoard;

    public Board(){
        chessBoard=new String[8][8];
        for(int row=7;row>=0;row--){
            for(int col=0;col<=7;col++){
                chessBoard[row][col]=getTile(row,col);
            }
        }
    }

    private String getTile(int row, int col) {
        char tileColumn= (char) ('A'+col);
        int tileRow=row+1;
        return "" + tileColumn + tileRow;
    }

    public String[][] getBoard(){
        return chessBoard;
    }

    public void printBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
