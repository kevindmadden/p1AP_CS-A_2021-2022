package u01_TheBasics;

public class s02_Operators {
    public static void main(String[] args) {

        //Mathematical Operators
        int addition = 9+3; //addition (12)
        System.out.println(addition);
        int subtraction = 75-4; //subtraction (71)
        int multiplication = 3*8; //multiplication (24)
        int division = 8/4; //division (this would store 2 inside the division variable)
        System.out.println(addition*subtraction); //this would print out the result of 12*71

        //int division
        int num1 = 8;
        int num2 = 3;
        System.out.println("What is 8/3?");
        System.out.println(num1/num2);
        System.out.println();

        double num3 = 8;
        double num4 = 3;
        System.out.println("What is 8/3?");
        System.out.print(num3/num4);
        System.out.println();

        System.out.println("What is 8/3?");
        System.out.print(num1/num4); //this is an int divided by a double
        System.out.println();

        //An int/int only ever gives an int
        //An int/double (or a double/int) gives a double
        //A double/double also gives a double

        /*
            Modulus Operator (%)
         */

        int num5 = 5;
        int num6 = 2;
        //If I asked you to divide 5/2 and tell me the remainder,
        //you would say the remainder is 1.
        //So this means that 5%2 is equal to 1.
        System.out.println(num5%num6); //This prints out 1.
        System.out.println(8%3); //prints out 2 because that's the remainder of 8/3

        //String operator (concatenation)
        String word1 = "There is";
        String word2 = "a dog.";
        System.out.println(word1+word2); //we need a space!
        System.out.println(word1+" "+word2); //adding a space

        /*
            Variable assignments: a few things to know
            -The equals sign does NOT mean what it means in mathematics.
            -The equals sign says:
                "Assign to the variable on the left the value on the right."
         */

        /*
        Compound Operators
         */
        int numOfTimes = 5;
        numOfTimes = 6; //you only need the "int" when you make the variable for the first time
        //Let's say we wanted to multiple numOfTimes by 3

        numOfTimes = 3*numOfTimes; //store in numOfTimes 3 times the current value of numOfTimes -- result is 6.
        //numOfTimes = 3*numOfTimes is the same as numOfTimes*=3
        numOfTimes*=5; //equivalent to numOfTimes = 5*numOfTimes -- result would be 18*5 => 90

        //Just like *= exists, you have this shortcut for the other operators too.
        // +=, -=, *=, /=, %=

        //Most handy compound operator is ++
        int count = 1;
        count++; //increments count by 1
        count--; //decrements count by 1















        //String Operator




    }
}
