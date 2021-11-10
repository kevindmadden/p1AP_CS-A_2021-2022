package u04_Classes.s02_SnowAnimationV2;

public class Snowflake {

    private double xPos;
    private double yPos;
    private double yVel;
    private double size;

    public Snowflake(){
        yPos = Math.random()*100+25;
        xPos = Math.random()*100;
        size = Math.random()*2+.5;
        yVel = 30;
    }

    public void calculate(double timeElapsed){
        yPos = yPos - yVel*timeElapsed;
        System.out.println(yPos);
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, size);
    }


}
