package u06_Checkers;

import java.awt.*;

public class Board {

    private Checker[][] board;

    public Board(){
        board = new Checker[8][8];
        board[0][0] = new Checker(1);
        board[0][2] = new Checker(1);
        board[0][4] = new Checker(1);
        board[0][6] = new Checker(1);
        board[2][0] = new Checker(1);
        board[2][2] = new Checker(1);
        board[2][4] = new Checker(1);
        board[2][6] = new Checker(1);
        board[1][1] = new Checker(1);
        board[1][3] = new Checker(1);
        board[1][5] = new Checker(1);
        board[1][7] = new Checker(1);

        board[6][0] = new Checker(2);
        board[6][2] = new Checker(2);
        board[6][4] = new Checker(2);
        board[6][6] = new Checker(2);
        board[7][1] = new Checker(2);
        board[7][3] = new Checker(2);
        board[7][5] = new Checker(2);
        board[7][7] = new Checker(2);
        board[5][1] = new Checker(2);
        board[5][3] = new Checker(2);
        board[5][5] = new Checker(2);
        board[5][7] = new Checker(2);
        System.out.println(this.toString());
    }

    public Checker[][] getBoard(){
        return board;
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

    public void draw(){
        StdDraw.setPenColor(new Color(50, 50, 59));
        StdDraw.filledRectangle(40, 40, 40, 40);
        for(int x = 0; x <= 80; x+=20){
            for(int y = 0; y <=80; y+=20){
                StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
                StdDraw.filledRectangle(x+5, y+5, 5, 5);
            }
        }
        for(int x = 10; x <= 80; x+=20){
            for(int y = 10; y <=80; y+=20){
                StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
                StdDraw.filledRectangle(x+5, y+5, 5, 5);
            }
        }

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] != null){
                    board[row][col].draw(col*10+5, row*10+5);
                }

            }
        }

        for(int row=0; row<board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] != null){
                    Checker tempChecker = board[row][col];
                    if(tempChecker.getMoveUpRight()==1){
                        StdDraw.setPenColor(StdDraw.YELLOW);
                        StdDraw.filledRectangle(col*10+15, row*10+15, 5, 5);
                    }
                }
            }
        }

    }

    public void unselectAllCheckers(){
        for(int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if(board[row][col] != null){
                    board[row][col].unselectChecker();
                }

            }
        }
    }



}
