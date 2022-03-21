package u08_Recursion;

public class s02_simpleRecursionControlled {

    public static void main(String[] args){
        printPlusOne(0);
    }

    public static int printPlusOne(int num){
        int temp = num + 1;
        System.out.println(temp);

        if(temp<500){
            printPlusOne(temp);
        }
        return 0;
    }

}
