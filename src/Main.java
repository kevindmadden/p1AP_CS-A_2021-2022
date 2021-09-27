import java.awt.*;

public class Main {
    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
        boolean didPressDown_SaveSlot = StdDraw.isMousePressed();
        StdDraw.setPenColor(StdDraw.BLUE);

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation

            double pointX = StdDraw.mouseX();
            double pointY = StdDraw.mouseY();
            System.out.println(pointX + ", " + pointY);
            boolean isClicked = false;
            if (didPressDown_SaveSlot && !StdDraw.isMousePressed()) {
                isClicked = true;
            }
            if (isClicked == true) {
                StdDraw.setPenColor(StdDraw.RED);
            } else {
                StdDraw.setPenColor(StdDraw.BLUE);
            }
            StdDraw.filledRectangle(pointX, pointY, 1, 2);

            didPressDown_SaveSlot = StdDraw.isMousePressed();
            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear();
        }
    }
}
