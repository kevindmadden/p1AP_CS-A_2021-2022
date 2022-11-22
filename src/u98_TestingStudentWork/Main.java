package u98_TestingStudentWork;

import java.awt.*;

public class Main {

    // TODO
    // TODO
    // The brown checkers can move to the spots that appear highlighted when the white checkers are clicked on.

    static final int BOARD_WIDTH = 8;
    static final int BOARD_HEIGHT = 8;
    static int turn =0;

    static Color color2;




    public static void main(String[] args){

        Board board = new Board();

        boolean prevIsMousePressed = false;

        StdDraw.setScale(0, 80);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
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
                int clickedRow = (int)(StdDraw.mouseY()/10);
                int clickedCol = (int)(StdDraw.mouseX()/10);
                boolean[][] tempHighlightedSpaces = board.getHighlightedSpots();
                Checker[][] tempBoard = board.getBoard();
                boolean didClickOnHighlight = false;
                //if we click on a highlighted space, it moves the selected checker there
                //1. Cycle through the board and find the selected checker
                //2. Remove the selected checker and place it on the highlighted square
                if(tempHighlightedSpaces[clickedRow][clickedCol]==true){
                    for(int row = 0; row < tempBoard.length; row++) {
                        for (int col = 0; col < tempBoard[0].length; col++) {
                            if (tempBoard[row][col] != null) {
                                if (tempBoard[row][col].getIsSelected()) {
                                    //System.out.println(row + "," + col);
                                    //System.out.println(clickedRow + "," + clickedCol);
                                    Checker selectedChecker = tempBoard[row][col];
                                    if(row==clickedRow+2 && clickedCol+2==col) {
                                        tempBoard[row--][col--] = null;
                                    }else if(row==clickedRow+2 && clickedCol-2==col){
                                        tempBoard[row--][col++] = null;
                                    }else if(row==clickedRow-2 && clickedCol-2==col){
                                        tempBoard[row++][col++] = null;
                                    }else if(row==clickedRow-2 && clickedCol+2==col){
                                        tempBoard[row++][col--] = null;
                                    }
                                    tempBoard[row][col] = null;
                                    tempBoard[clickedRow][clickedCol] = selectedChecker;
                                    board.unselectAllCheckers();
                                    board.unselectAllHighlights();
                                    turn++;
                                    //System.out.println(turn);
                                    /*if(selectedChecker.player == 1 && row == 7){
                                        selectedChecker.setKing(true);
                                        System.out.println("ii");

                                    }
                                    if(selectedChecker.player == 2 && row == 0){
                                        selectedChecker.setKing(true);

                                    }*/

                                }
                            }
                        }
                    }
                    //System.out.println(board.toString());
                }else {

                    //Select Checker Logic
                    Checker selectedChecker = tempBoard[clickedRow][clickedCol];
                    board.unselectAllHighlights();
                    board.unselectAllCheckers();
                    if(selectedChecker.player == 1 && clickedRow == 7){
                        selectedChecker.setKing(true);

                    }
                    if(selectedChecker.player == 2 && clickedRow == 0){
                        selectedChecker.setKing(true);
                    }
                    if (selectedChecker != null) {
                        selectedChecker.selectChecker(); //Select clicked checker
                        //Creating highlights based on checker clicked
                        if (turn % 2 == 0) {
                            if(selectedChecker.player == 1) {
                                if (clickedRow + 1 <= 7 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow + 1][clickedCol + 1] == null && selectedChecker.player == 1) { //up-right 1
                                    tempHighlightedSpaces[clickedRow + 1][clickedCol + 1] = true;
                                }
                                if (clickedRow + 1 <= 7 && clickedCol - 1 >= 0 && tempBoard[clickedRow + 1][clickedCol - 1] == null && selectedChecker.player == 1) { //up-left 1
                                    tempHighlightedSpaces[clickedRow + 1][clickedCol - 1] = true;
                                }
                                if (clickedRow + 2 <= 7 && clickedCol + 2 < BOARD_WIDTH && tempBoard[clickedRow + 2][clickedCol + 2] == null && clickedRow + 1 <= 7 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow + 1][clickedCol + 1] != null && selectedChecker.player == 1 && tempBoard[clickedRow + 1][clickedCol + 1].getPlayer() == 2) { //up-right 1
                                    tempHighlightedSpaces[clickedRow + 2][clickedCol + 2] = true;
                                }
                                if (clickedRow + 2 <= 7 && clickedCol - 2 >= 0 && tempBoard[clickedRow + 2][clickedCol - 2] == null && clickedRow + 1 <= 7 && clickedCol - 1 >= 0 && tempBoard[clickedRow + 1][clickedCol - 1] != null && selectedChecker.player == 1 && tempBoard[clickedRow + 1][clickedCol - 1].getPlayer() == 2) { //up-left 1
                                    tempHighlightedSpaces[clickedRow + 2][clickedCol - 2] = true;
                                }


                                if (clickedRow - 1 >= 0 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow - 1][clickedCol + 1] == null && tempBoard[clickedRow][clickedCol].isKing() == true && selectedChecker.player == 1) { //down-right 1
                                    tempHighlightedSpaces[clickedRow - 1][clickedCol + 1] = true;
                                }
                                if (clickedRow - 1 >= 0 && clickedCol - 1 >= 0 && tempBoard[clickedRow - 1][clickedCol - 1] == null && tempBoard[clickedRow][clickedCol].isKing() == true && selectedChecker.player == 1) { //down-left 1
                                    tempHighlightedSpaces[clickedRow - 1][clickedCol - 1] = true;
                                }
                                if (clickedRow - 2 >= 0 && clickedCol + 2 < BOARD_WIDTH && tempBoard[clickedRow - 2][clickedCol + 2] == null && clickedRow - 1 >= 0 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow - 1][clickedCol + 1] != null && tempBoard[clickedRow - 1][clickedCol + 1].getPlayer() == 2 && tempBoard[clickedRow][clickedCol].isKing() == true && selectedChecker.player == 1) { //down-right 1
                                    tempHighlightedSpaces[clickedRow - 2][clickedCol + 2] = true;
                                }
                                if (clickedRow - 2 >= 0 && clickedCol - 2 >= 0 && tempBoard[clickedRow - 2][clickedCol - 2] == null && clickedRow - 1 >= 0 && clickedCol - 1 >= 0 && tempBoard[clickedRow - 1][clickedCol - 1] != null && tempBoard[clickedRow - 1][clickedCol - 1].getPlayer() == 2 && tempBoard[clickedRow][clickedCol].isKing() == true && selectedChecker.player == 1) { //down-left 1
                                    tempHighlightedSpaces[clickedRow - 2][clickedCol - 2] = true;
                                }
                            }

                        } else {
                            if(selectedChecker.player == 2) {
                                if (clickedRow - 1 >= 0 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow - 1][clickedCol + 1] == null && selectedChecker.player == 2) { //down-right 1
                                    tempHighlightedSpaces[clickedRow - 1][clickedCol + 1] = true;
                                }
                                if (clickedRow - 1 >= 0 && clickedCol - 1 >= 0 && tempBoard[clickedRow - 1][clickedCol - 1] == null && selectedChecker.player == 2) { //down-left 1
                                    tempHighlightedSpaces[clickedRow - 1][clickedCol - 1] = true;
                                }
                                if (clickedRow - 2 >= 0 && clickedCol + 2 < BOARD_WIDTH && tempBoard[clickedRow - 2][clickedCol + 2] == null && clickedRow - 1 >= 0 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow - 1][clickedCol + 1] != null && selectedChecker.player == 2 && tempBoard[clickedRow - 1][clickedCol + 1].getPlayer() == 1) { //down-right 1
                                    tempHighlightedSpaces[clickedRow - 2][clickedCol + 2] = true;
                                }
                                if (clickedRow - 2 >= 0 && clickedCol - 2 >= 0 && tempBoard[clickedRow - 2][clickedCol - 2] == null && clickedRow - 1 >= 0 && clickedCol - 1 >= 0 && tempBoard[clickedRow - 1][clickedCol - 1] != null && selectedChecker.player == 2 && tempBoard[clickedRow - 1][clickedCol - 1].getPlayer() == 1) { //down-left 1
                                    tempHighlightedSpaces[clickedRow - 2][clickedCol - 2] = true;
                                }


                                if (clickedRow + 1 <= 7 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow + 1][clickedCol + 1] == null && tempBoard[clickedRow][clickedCol].isKing() == true) { //up-right 1
                                    tempHighlightedSpaces[clickedRow + 1][clickedCol + 1] = true;
                                }
                                if (clickedRow + 1 <= 7 && clickedCol - 1 >= 0 && tempBoard[clickedRow + 1][clickedCol - 1] == null && tempBoard[clickedRow][clickedCol].isKing() == true) { //up-left 1
                                    tempHighlightedSpaces[clickedRow + 1][clickedCol - 1] = true;
                                }
                                if (clickedRow + 2 <= 7 && clickedCol + 2 < BOARD_WIDTH && tempBoard[clickedRow + 2][clickedCol + 2] == null && clickedRow + 1 <= 7 && clickedCol + 1 < BOARD_WIDTH && tempBoard[clickedRow + 1][clickedCol + 1] != null && tempBoard[clickedRow + 1][clickedCol + 1].getPlayer() == 1 && tempBoard[clickedRow][clickedCol].isKing() == true) { //up-right 1
                                    tempHighlightedSpaces[clickedRow + 2][clickedCol + 2] = true;
                                }
                                if (clickedRow + 2 <= 7 && clickedCol - 2 >= 0 && tempBoard[clickedRow + 2][clickedCol - 2] == null && clickedRow + 1 <= 7 && clickedCol - 1 >= 0 && tempBoard[clickedRow + 1][clickedCol - 1] != null && tempBoard[clickedRow + 1][clickedCol - 1].getPlayer() == 1 && tempBoard[clickedRow][clickedCol].isKing() == true) { //up-left 1
                                    tempHighlightedSpaces[clickedRow + 2][clickedCol - 2] = true;
                                }
                            }


                        }
                    }
                }
                //System.out.println(board.toString());
                //System.out.println(board.printHighlightedBoard());



            }



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}
