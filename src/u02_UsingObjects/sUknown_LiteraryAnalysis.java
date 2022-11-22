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
        URL path = sUknown_LiteraryAnalysis.class.getResource("s_unknown_book.txt");
        File f = new File(path.getFile());
        //BufferedReader reader = new BufferedReader(new FileReader(f));

        try {

            Scanner sc = new Scanner(f);

            String test = "";
            while (sc.hasNextLine()) {
                test += sc.nextLine();
            }
            System.out.println(test);
            //sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}