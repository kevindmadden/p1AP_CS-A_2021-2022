package WordCloud;

public class Word {
    private String word;
    private int frequency = 0;
    Word(String word){
        this.word = word;
        this.frequency = 1;
    }

    public void increaseCount(){
        this.frequency++;
    }


}
