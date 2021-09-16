package u02_UsingObjects;

public class s10_equalsComparison {
    public static void main(String[] args){
        //For variable types double, int, boolean -- compare these with ==
        //For string variable types, you use .equals

        int num1 = 89;
        int num2 = 89;
        if(num1==num2){
            System.out.println("These are equal!");
        }

        String word1 = "this";
        String word2 = "this";

        if(word1.equals(word2)){
            System.out.println("These are the same!");
        }


    }
}
