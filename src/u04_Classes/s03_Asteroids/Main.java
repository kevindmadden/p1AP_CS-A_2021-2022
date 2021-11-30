package u04_Classes.s03_Asteroids;

import java.awt.event.KeyEvent;

public class Main {

    /*
            Brainstorming
            -Player spaceship
                -Shape - Collision Detection
                -Movement
                    -Making it possible for the ship to rotate
                        -What direction is it pointing in?
                    -Keyboard input
                    -There's a maximum velocity
                    -Controlling acceleration
                    -v=v+a*timeElapsed
                    -
                -Shooting
            -Asteroids
                -Second thing to focus on
                -First focus on asteroids disappearing when shot
                    -Then focus on them breaking apart
            -Alien Ships
            -Sound effects? (StdDraw doesn't support)

     */

    public static void main(String[] args){
        Spaceship spaceship = new Spaceship();

        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50, 50, 50);


            //Calculations
            spaceship.calculate(timeElapsed);

            //Draw
            spaceship.draw();



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }


}
