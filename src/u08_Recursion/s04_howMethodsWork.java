package u08_Recursion;

public class s04_howMethodsWork {

    public static void main(String[] args){
        method1(9);
    }

    //"I'm method2" gets printed out first. Then the code jumps back to method1 and prints "I'm method1".
    public static int method1(int num){
        method2(num);
        System.out.println("I'm method1");
        return 0;
    }

    public static int method2(int num){
        System.out.println("I'm method2");
        return 0;
    }

}
