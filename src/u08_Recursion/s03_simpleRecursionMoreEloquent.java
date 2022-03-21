package u08_Recursion;

public class s03_simpleRecursionMoreEloquent {

    public static void main(String[] args){
        printPlusOne(1);
    }

    public static int printPlusOne(int num){
        int temp = num + 1;
        System.out.println(temp);
        if(temp<4){ printPlusOne(temp);}
        System.out.println(temp);
        return 0;
    }

}
