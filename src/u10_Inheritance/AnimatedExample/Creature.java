package u10_Inheritance.AnimatedExample;

public class Creature {
    protected double xPos;
    protected double yPos;
    protected double xVel;
    protected double yVel;
    protected double radius;

    public Creature(double xPos, double yPos, double xVel, double yVel, double radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
        this.radius = radius;
    }

    public Creature(){
        //useless default constructor
    }

    public void calculate(double timeElapsed){
        xPos = xPos+xVel*timeElapsed;
        yPos = yPos+yVel*timeElapsed;
    }

    public void draw(){
        StdDraw.filledCircle(xPos, yPos, radius);
    }

    public void test(){

    }

}
