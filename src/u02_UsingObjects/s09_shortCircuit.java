package u02_UsingObjects;

public class s09_shortCircuit {
    public static void main(String[] args){
        //System.out.println(2/0); //if we ran this line of code, we get an error
        int num7 = 7;
        int num0 = 0;

        /*
        if(num0/num7==0 && num7/num0==0){
            System.out.println("This will never be printed!!");
        }
        */

        //Example of short-circuiting.
        if( num0/num7==0 || num7/num0==0){
            System.out.println("This will be printed!!");
        }

        //This would error out.
        if(num7/num0==0 || num0/num7==0){
            System.out.println("This will not be printed!!");
        }


    }
}
