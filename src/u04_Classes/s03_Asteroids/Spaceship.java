package u04_Classes.s03_Asteroids;

import java.awt.event.KeyEvent;

public class Spaceship {

    private double degrees;
    private double xRatio;
    private double yRatio;

    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double xAccel;
    private double yAccel;



    public Spaceship(){
        degrees = 0;

        xPos = 50;
        yPos = 50;
        xVel = 0;
        yVel = 0;
        xAccel = 0;
        yAccel = 0;
    }

    public void calculate(){
        xRatio = Math.sin(Math.toRadians(degrees))*(-1);
        yRatio = Math.cos(Math.toRadians(degrees));

        //Rotation Calculations
        if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
            degrees = degrees + 5;
        }
        if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
            degrees = degrees - 5;
        }
        System.out.println(degrees);
        System.out.println("x: " + xRatio);
        System.out.println("y: " + yRatio);



        //Rocket Boost Calculations
        if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){

        }



    }

    public void draw(){
        //StdDraw.setPenColor(StdDraw.YELLOW); testing
        //StdDraw.line(50, 50, 50+xRatio*100, 50+yRatio*10);
        StdDraw.picture(xPos, yPos, "Spaceship.png", 10, 10, degrees);
    }

    public double getxRatio() {
        return xRatio;
    }

    public double getyRatio() {
        return yRatio;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }
}
