package u06_Checkers;

import java.awt.*;

public class Checker {

    private int playerNum;
    private Color color;
    boolean isKing;

    public Checker(int playerNum){
        this.playerNum = playerNum;
        if(this.playerNum == 1){
            color = Color.WHITE;
        }else{
            color = Color.GREEN;
        }
        this.isKing = false;
    }

    public void draw(int x, int y){
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, 4);
    }



}
