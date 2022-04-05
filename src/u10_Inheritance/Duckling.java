package u10_Inheritance;

public class Duckling extends Duck {

    public Duckling(){
        super("I can't talk because I'm a baby", true, true);

    }

    public void talk(){
        System.out.println("I'm a smart duckling!");
    }


}
