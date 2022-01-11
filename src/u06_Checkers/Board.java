package u06_Checkers;

import java.util.Arrays;

public class Board {

    Checkers[][] board;

    public Board(){
        board = new Checkers[8][8];
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        String print = "";
        for(int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                print += board[row][col] + " ";
            }
            print += "\n";
        }
        return print;
    }

}
