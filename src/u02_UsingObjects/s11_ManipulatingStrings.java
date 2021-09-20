package u02_UsingObjects;

//Complete exercises on this page of the text (skip the project):
// https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit2-Using-Objects/topic-2-7-string-methods.html

public class s11_ManipulatingStrings {


    public static void main(String[] args){
        String sentence = "Let's say we have a long sentence.";
        //                 0123456789........................

        char someChar = sentence.charAt(6);
        System.out.println(someChar);

        //Starting index is inclusive, ending index is exclusive
        String sentenceFragment = sentence.substring(2, 9); //pulled out the String beginning at index 2 and ending right before index 8
        System.out.println(sentenceFragment);

        //Let's say you wanted to pull out that s again at index using substring
        String sentenceFragment2 = sentence.substring(6,7);
        System.out.println(sentenceFragment2);

        //Let's say we want to pull in beginning at the word "say" and through the rest of the sentence
        String sentenceFragment3 = sentence.substring(6);
        System.out.println(sentenceFragment3);

        //Let's say we want to figure out where the word "long" as at. What's the starting index number for that word?
        int indexOfLong = sentence.indexOf("long");
        System.out.println(indexOfLong);


        //compareTo
        String word1 = "cheese";
        String word2 = "dolphin";
        System.out.println(word1.compareTo(word2)); //Think of this from the perspective of word2. So if you start at word2, you have to go BACK in the alphabet in order to get to word1 (so that's why you get a -1 returned).
        System.out.println(word2.compareTo(word1));
        System.out.println(word1.compareTo(word1));




    }
}
