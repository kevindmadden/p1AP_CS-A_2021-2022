package u08_Recursion;

public class s05_factorial {

    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
    }

    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        int value = num*factorial(num-1);
        return value;
    }

}
