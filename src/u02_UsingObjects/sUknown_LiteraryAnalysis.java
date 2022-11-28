package u02_UsingObjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

public class sUknown_LiteraryAnalysis {

    public static void main(String[] args) throws FileNotFoundException {
        String book = "";
        URL path = sUknown_LiteraryAnalysis.class.getResource("s_unknown_book2.txt");
        File f = new File(path.getFile());
        //BufferedReader reader = new BufferedReader(new FileReader(f));

        int numCarriageReturns = 0;
        try {

            Scanner sc = new Scanner(f);

            //String test = "";
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                book += line+"\n";
                numCarriageReturns++;
            }
            //System.out.println(test);
            //sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Text
        System.out.println(book);


        //Character count
        System.out.println("Characters: "+book.length());

        //# of Spaces
        int numOfSpaces = 0;
        for(int i=0; i<book.length(); i++){
            if(book.charAt(i)==' '){
                numOfSpaces++;
            }
        }
        System.out.println("Num of Spaces "+numOfSpaces);

        for(int i=0; i<book.length()-1; i++){ //Taking into account people who put two spaces after a period.
            if(book.substring(i,i+2).equals("  ")){
                numOfSpaces--;
            }
        }
        System.out.println("Num of Spaces "+numOfSpaces);

        //# of words



    }



}