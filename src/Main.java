import u02_UsingObjects.StdDraw;

public class Main {

    public static void main(String[] args) {

        //Print Statements
        System.out.println("Hello World!");
        System.out.println("This is a sentence.");
        System.out.print("Hello World!");
        System.out.print("This is a sentence.");
        System.out.print(1000);

        //Variables
        int number = 9; //integer variable
        double number2 = 9.6;
        String word = "This is a sentence in stored in a variable";
        boolean isItRaining = true;
        boolean isItCloudy = false;
        char aSingleCharacter = 'a';

        System.out.println(number);
        System.out.println(word);

    }

    public static class AnimationTemplate {

        public static void main(String[] args){
            StdDraw.setScale(0, 100);
            StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

            double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
            while(true){
                StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation








                StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
                StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            }
        }

    }
}