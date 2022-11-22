package u98_TestingStudentWork;

import java.awt.*;

public class Checker {

    private int playerNum;
    private Color color;
    private boolean isKing;
    private boolean isSelected;
    public int player;

    // Setting int to 0 means it can't move and/or isn't selected.
    // 1 means it can slide in that direction.
    // 2 means it can jump in that direction.
    private int moveUpRight;
    private int moveUpLeft;
    private int moveDownLeft;
    private int moveDownRight;

    public Checker(int playerNum){
        this.playerNum = playerNum;
        if(this.playerNum == 1){
            color = Color.WHITE;
            player = 1;
        }else{
            color = new Color(207,156,99);
            player = 2;
        }

        this.isSelected = false;
       /* this.moveUpRight = 0;
       this.moveUpLeft = 0;
       this.moveDownLeft = 0;
       this.moveDownRight = 0; */


    }

    public void draw(int x, int y){
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, 3.8);

        //Outline
        StdDraw.setPenColor(StdDraw.BLACK);
        if(this.isSelected){
            StdDraw.setPenColor(StdDraw.GREEN);
        }
        StdDraw.setPenRadius(0.007);
        StdDraw.circle(x, y, 3.8);
    }
    //row and col of selected checker
   /*public void highlightMovementOptions(Checker[][] board, int row, int col){
   }*/

    public boolean getIsSelected(){
        return this.isSelected;
    }

    public void selectChecker(){
        this.isSelected = true;
    }

    public void unselectChecker(){
        this.isSelected = false;
    }

    public int getMoveUpRight(){return this.moveUpRight;}

    public int getMoveUpLeft() {
        return moveUpLeft;
    }

    public int getMoveDownLeft() {
        return moveDownLeft;
    }

    public int getMoveDownRight() {
        return moveDownRight;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public boolean isKing() {
        return this.isKing;
    }

    public void setKing(boolean king) {
        this.isKing = king;
        System.out.println(isKing());

    }

}
