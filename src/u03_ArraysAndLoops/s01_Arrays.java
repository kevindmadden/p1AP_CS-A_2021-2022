package u03_ArraysAndLoops;

public class s01_Arrays {
    public static void main(String[] args){
        // index #s               0          1          2         3          4
        String[] groceryStores = {"Target", "Walmart", "K-Mart", "Mitsuwa", "Meijer"};
        // index #s          0  1  2   3   4   5   6   7   8   9
        int[] countByFour = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};

        System.out.println(groceryStores[2]); //prints out index number 2 of groceryStore array.
        System.out.println(countByFour[6]); //prints out index number 6 of the countByFour array.

        System.out.println(groceryStores.length); //prints out the number of items listed in the groceryStores array

        //So when you first create an array in this manner by just specifying the length of the array, then keep in mind that you haven't set the values of any of the items in the array!

        double[] nums = new double[100];
        System.out.println(nums.length);
        System.out.println(nums[95]); //This will print out 0.0 because we never specified what item we wanted to store at index 95.

        boolean[] boolArr = new boolean[100];
        System.out.println(boolArr[95]); //prints out default value of false

        String[] words = new String[50];
        System.out.println(words[30]);

        /*These are the default values that get used based on the data type:
            int => 0
            double => 0.0
            boolean => false
            String => null
         */

        //Overwriting a previous value stored in an array with a new value

        //Let's say that K-mart went out of business and that we want to now replace the K-mart in our groceryStores array with Kroger.
        System.out.println("Before..."+groceryStores[2]);
        groceryStores[2] = "Kroger";
        System.out.println("After..."+groceryStores[2]);





    }


}
