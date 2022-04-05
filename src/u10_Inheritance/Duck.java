package u10_Inheritance;

public class Duck extends Bird {

    public Duck(){
        super("I'm a duck", false, true);
    }

    public Duck(String speechContent, boolean isAlive, boolean isFlying){
        super(speechContent, isAlive, isFlying);
    }


}
