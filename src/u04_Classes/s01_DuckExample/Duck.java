package u04_Classes.s01_DuckExample;

public class Duck {

    //instance variables/fields
    private int numOfTimesHonked;
    private String speechContent;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isAlive;

    //Static variable
    private static int totalNumOfHonks = 0;

    public Duck(){
        numOfTimesHonked = 0;
        speechContent = "I'm a duck.";
        isSwimming = true;
        isFlying = false;
        isAlive = true;
    }

    public void honk(){
        numOfTimesHonked++;
        totalNumOfHonks++;
        //System.out.println("totalNumOfHonks: "+totalNumOfHonks); //Prints out total num of honks
        System.out.println(speechContent);
    }

    public static int getTotalNumOfHonks(){
        Math.random();
        //speechContent = "something random";
        return totalNumOfHonks;
    }




    //In intellij: Right-click => generate
    //You can generate getters and setters and toString

    //Getter Method/Accessor Method
    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }

    //Setter Methods/Mutator Methods
    public void setNumOfTimesHonked(int numOfTimesHonked){
        this.numOfTimesHonked = numOfTimesHonked;
    }

    //You can use Intellij to generate getter and setter methods as well as the String method.
    //Just right-click, and then click generate.

    @Override
    public String toString() {
        return "Duck{" +
                "numOfTimesHonked=" + numOfTimesHonked +
                ", speechContent='" + speechContent + '\'' +
                ", isSwimming=" + isSwimming +
                ", isFlying=" + isFlying +
                ", isAlive=" + isAlive +
                '}';
    }

    public void setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getSpeechContent() {
        return speechContent;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
