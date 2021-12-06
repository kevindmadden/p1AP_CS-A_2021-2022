package u04_Classes.s03_Asteroids;

public class Bullet {

    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double radius;

    private double xRatio;
    private double yRatio;
    private double cooldown; //

    public Bullet(double xPos, double yPos, double xRatio, double yRatio){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xRatio = xRatio;
        this.yRatio = yRatio;
        this.xVel = 100*xRatio;
        this.yVel = 100*yRatio;
        this.radius = 0.5;
    }

    public void calculate(double timeElapsed){
        xPos = xPos + xVel*timeElapsed;
        yPos = yPos + yVel*timeElapsed;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, radius);
    }


}
