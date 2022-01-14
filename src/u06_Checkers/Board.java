package u06_Checkers;

public class Board {

    private Checker[][] board;

    public Board(){
        board = new Checker[8][8];

        Checker checker = new Checker(1);
        board[0][0] = checker;


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
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledRectangle(40, 40, 40, 40);
        for(int x = 0; x <= 80; x+=20){
            for(int y = 0; y <=80; y+=20){
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(x+5, y+5, 5, 5);
            }
        }
        for(int x = 10; x <= 80; x+=20){
            for(int y = 10; y <=80; y+=20){
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledRectangle(x+5, y+5, 5, 5);
            }
        }
    }



}
