package u04_Classes.s01_DuckExample;

public class Main {

    public static void main(String[] args){

        Main main = new Main();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        duck1.honk();
        System.out.println(duck1.getNumOfTimesHonked());
        System.out.println(duck2.getNumOfTimesHonked());
        duck2.honk();

        System.out.println("Printing total honks from main method: "+Duck.getTotalNumOfHonks());


        System.out.println(duck1.toString());


    }
}
