package u02_UsingObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sUknown_LiteraryAnalysis {

    public static void main(String[] args) {
        String book = "";

       File file = new File("src\\u02_UsingObjects\\s_unknown_book.txt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String test = sc.nextLine();
                System.out.println(test);
            }
            //sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}