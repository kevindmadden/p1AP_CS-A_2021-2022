package u06_Checkers;

import java.awt.*;

public class Checker {

    private int playerNum;
    private Color color;
    private boolean isKing;
    private boolean isSelected;

    public Checker(int playerNum){
        this.playerNum = playerNum;
        if(this.playerNum == 1){
            color = Color.WHITE;
        }else{
            color = new Color(207,156,99);
        }
        this.isKing = false;
        this.isSelected = false;
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

    public boolean canCheckerJump(Checker[][] board, int rowOfChecker, int colOfChecker){



        return false;
    }

    public void selectChecker(){
        this.isSelected = true;
    }

    public void unselectChecker(){
        this.isSelected = false;
    }





}
