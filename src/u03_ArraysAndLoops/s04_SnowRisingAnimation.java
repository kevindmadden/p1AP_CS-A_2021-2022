package u03_ArraysAndLoops;

public class s04_SnowRisingAnimation {


    public static double randomizeXCoordinate(){
        return Math.random()*100;
    }

    public static void main(String[] args){
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double[] xPos = new double[500];
        double[] yPos = new double[500];
        double[] fallLocation = new double[1000];

        for(int i=0; i<yPos.length; i++){
            double randomNum = ((Math.random()*100))+100;
            yPos[i] = randomNum;
            //System.out.println(yPos[i]);
        }

        for(int i=0; i<xPos.length; i++){
            xPos[i] = randomizeXCoordinate();
            //System.out.println(xPos[i]);
        }


        double yVel = 600;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(50, 50, 50, 50);

            for(int i=0; i < yPos.length; i++){
                yPos[i] = yPos[i] - yVel*timeElapsed;
            }

            StdDraw.setPenColor(StdDraw.WHITE);
            for(int i=0; i < yPos.length; i++){
                StdDraw.filledCircle(xPos[i], yPos[i], .2);
            }

            StdDraw.setPenColor(StdDraw.WHITE);
            for(int i=0; i < fallLocation.length; i++){
                //StdDraw.filledRectangle(i/10.0, 0, 0., fallLocation[i]*10);
                StdDraw.filledEllipse(i/10.0, 0, 1*(fallLocation[i]), fallLocation[i]*0.5);

            }

            //Reset Snowflake Position
            for(int i=0; i < yPos.length; i++){
                if(yPos[i] <= 0){
                    yPos[i] = 100+Math.random()*20;
                    fallLocation[raiseSnowOnGround(xPos[i])] += 1;
                    xPos[i] = randomizeXCoordinate();
                }
            }




            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static int raiseSnowOnGround(double xPos){
        return (int)(xPos*10);
    }
}
