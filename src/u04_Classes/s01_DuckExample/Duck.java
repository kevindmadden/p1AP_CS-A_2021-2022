package u04_Classes.s01_DuckExample;

public class Duck {

    //instance variables/fields
    private int numOfTimesHonked;
    private String speechContent;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isAlive;

    public Duck(){
        numOfTimesHonked = 0;
        speechContent = "I'm a duck.";
        isSwimming = true;
        isFlying = false;
        isAlive = true;
    }

    public void honk(){
        numOfTimesHonked++;
        System.out.println(speechContent);
    }

    //Getter Method
    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }

}
