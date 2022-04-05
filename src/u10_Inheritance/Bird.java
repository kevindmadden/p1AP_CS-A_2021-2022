package u10_Inheritance;

public class Bird {
    private String speechContent;
    private boolean isFlying;
    private boolean isAlive;

    public Bird(){
        speechContent = "I'm a bird";
        isFlying = false;
        isAlive = true;
    }

    public Bird(String speechContent, boolean isAlive, boolean isFlying){
        this.speechContent = speechContent;
        this.isAlive = isAlive;
        this.isFlying = isFlying;
    }

    public void talk(){
        System.out.println(speechContent);
    }

    @Override
    public String toString(){
        return speechContent+", "+isFlying+", "+isAlive;
    }




}
