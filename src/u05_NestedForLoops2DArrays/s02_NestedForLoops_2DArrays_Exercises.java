package u05_NestedForLoops2DArrays;

import java.util.Arrays;

public class s02_NestedForLoops_2DArrays_Exercises {


    public static void main(String[] args){
        int[][] arr = { {0,1,2,3,4,5,6,7,8,9}, {10,11,12,13,14,15,16,17,18,19}, {20,21,22,23,24,25,26,27,28,29}, {30,31,32,33,34,35,36,37,38,39}, {40,41,42,43,44,45,46,47,48,49}, {50,51,52,53,54,55,56,57,58,59} };

        System.out.println(Arrays.deepToString(arr));

        //printArray(arr);

    }


    public static void exercise1Solution(){

    }

    public static void printArray(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col]+ "\t");
            }
            System.out.println();
        }
    }


}
