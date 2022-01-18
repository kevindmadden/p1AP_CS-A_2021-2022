package u06_Checkers;

public class Main {
    public static void main(String[] args){

        Board board = new Board();

        boolean prevIsMousePressed = false;

        StdDraw.setScale(0, 80);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){
            board.draw();

            //Clicking Logic
            boolean didClickOccur = false;
            if(prevIsMousePressed && !StdDraw.isMousePressed()){
                didClickOccur = true;
            }
            prevIsMousePressed = StdDraw.isMousePressed();

            if(didClickOccur){
                //Convert coordinates of mouse click [use mouseX() and mouseY()] to a row, col number

                //Look at the spot in the 2D array of the row, col from above ^^ (i.e., you are getting a reference to the checker at that spot in the 2d array)

                    //Safety check - What happens if the user clicks on an empty spot?
                        //If a use clicks on an empty space, then it's going to be null.
                            //ensure that you are only calling methods on the checker if it isn't null

                //Once you have that checker reference, call the selectChecker method.

                //Try to get things working so that when you click on another checker or an empty space, the previous selected checker gets unselected
            }



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}
