package u08_Recursion;

public class s01_simpleRecursionExample {

    public static void main(String[] args){
        printPlusOne(0);
    }

    public static int printPlusOne(int num){
        int temp = num + 1;
        System.out.println(temp);

        printPlusOne(temp);
        return 0;
    }

}
