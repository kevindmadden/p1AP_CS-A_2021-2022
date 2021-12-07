package u04_Classes.s03_Asteroids;

public class Asteroid {
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double radius;
    private boolean canBeReplaced;

    // Asteroid asteroid = new Asteroid(1,2,3,4,6)
    // Asteroid asteroid = new Asteroid() - more random

    public Asteroid(double xPos, double yPos, double xVel, double yVel, double radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
        this.radius = radius;
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
