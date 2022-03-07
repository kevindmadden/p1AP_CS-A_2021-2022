package u07_ArrayList;

import java.util.ArrayList;

public class s01_Differences {

    public static void main(String args[]){
        //Task: Create an array with 8 random int elements

        //Old Way
        int[] oldWay = new int[8];
        for(int i=0; i<oldWay.length; i++){
            oldWay[i]=(int)(Math.random()*10);
        }

        //New Way - ArrayList
        ArrayList<Integer> newWay = new ArrayList<>();
        for(int i=0; i<8; i++){
            newWay.add((int)(Math.random()*10));
        }

        //Task: Overwrite the element at index 5 with a value of 10000

        //Old Way
        oldWay[5] = 10000;

        //ArrayList
        //newWay.get(5) = 10000; Don't do this!
        newWay.set(5, 10000);

    }

}
