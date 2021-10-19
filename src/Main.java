public class Main {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
        /*__________________________________________________________________________
            ARRAYS
        __________________________________________________________________________*/

        //SNOW:

        double[] xPos_Snow = new double[500];
        double[] yPos_Snow = new double[500];

        //CLOUDS:

        double[] xPos_Clouds = new double[5];
        double[] yPos_Clouds = new double[5];

        /*__________________________________________________________________________
            ARRAY POSITIONS
        __________________________________________________________________________*/

        //SNOW POSITIONS:

        for (int i = 0; i < yPos_Snow.length; i++) {
            double randomNum = 100 + (Math.random() * 90);
            yPos_Snow[i] = randomNum;
            //System.out.println(yPos_Snow[i]);
        }

        for (int i = 0; i < xPos_Snow.length; i++) {
            double randomNum = Math.random() * 100;
            xPos_Snow[i] = randomNum;
            // System.out.println(xPos_Snow[i]);
        }

        double yVel = 70;

        //CLOUD POSITIONS:

        for (int i = 0; i < yPos_Clouds.length; i++) {
            double randomNum = 100 + (Math.random() * 90);
            yPos_Clouds[i] = randomNum;
            //System.out.println(yPos_Clouds[i]);
        }

        for (int i = 0; i < xPos_Clouds.length; i++) {
            double randomNum = Math.random() * 100;
            xPos_Clouds[i] = randomNum;
            //System.out.println(xPos_Clouds[i]);
        }

        double xVel = 70;

        /*__________________________________________________________________________
            "WHILE" LOOP
        __________________________________________________________________________*/

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {

            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.filledRectangle(50, 50, 60, 60);

            /*__________________________________________________________________________
                CALCULATIONS
            __________________________________________________________________________*/

            //SNOW CALCULATIONS:

            for (int i = 0; i < yPos_Snow.length; i++) {
                yVel = Math.random() * 100 - 20;
                yPos_Snow[i] = yPos_Snow[i] - yVel * timeElapsed;
                if (yPos_Snow[i] <= 0) {
                    yPos_Snow[i] = 100;
                }
            }

            //CLOUD CALCULATIONS:
            for (int i = 0; i < xPos_Clouds.length; i++) {
                xVel = Math.random() * 100 - 20;
                xPos_Clouds[i] = xPos_Clouds[i] - xVel * timeElapsed;
            }

            /*__________________________________________________________________________
                DRAWINGS
            __________________________________________________________________________*/

            //SNOW DRAWING:

            StdDraw.setPenColor(StdDraw.WHITE);
            for (int i = 0; i < yPos_Snow.length; i++) {
                StdDraw.filledCircle(xPos_Snow[i], yPos_Snow[i], .5);
            }

            //CLOUD DRAWING:

            StdDraw.setPenColor(StdDraw.GRAY);
            for (int i = 0; i < xPos_Clouds.length; i++) {
                System.out.println(yPos_Clouds[i]);
                StdDraw.filledRectangle(xPos_Clouds[i], yPos_Clouds[i], 6, 8);
            }

            /*__________________________________________________________________________
                VARIABLES
            __________________________________________________________________________*/

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}