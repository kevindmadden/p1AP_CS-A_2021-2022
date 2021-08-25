package u02_UsingObjects;
import java.util.Scanner;

public class s01_KeyboardInput {

    public static void main(String args[]){


        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int enteredInt = kb.nextInt();
        System.out.println("The int you entered is: " + enteredInt);

        //Dummy kb.nextLine()
        // You need to have a dummy kb.nextLine() whenever you are switching from
        //  pulling in an int to pulling in a String (whenever you go from
        //  kb.nextInt() to kb.nextLine())
        kb.nextLine();
        System.out.println("Enter something on keyboard");
        String typedMessage = "hello world!";
        System.out.println("This is what we typed: " + typedMessage);

        System.out.println("Enter an integer:");
        int enteredInt2 = kb.nextInt();
        System.out.println("The int you entered is: " + enteredInt2);




    }

}
