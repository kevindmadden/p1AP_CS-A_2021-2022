package u10_Inheritance;

public class Main {

    public static void main(String[] args){
        Bird birdObj = new Bird();
        System.out.println(birdObj.toString());

        Bird birdObj2 = new Bird("Hi", false, true);
        System.out.println(birdObj2.toString());

        Duck duck1 = new Duck();
        System.out.println(duck1.toString());

        Duckling duckling1 = new Duckling();
        //System.out.println(duckling1.toString());
        duckling1.talk();






    }

}
