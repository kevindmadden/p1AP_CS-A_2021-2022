package u07_ArrayList;
import java.util.ArrayList;

public class s03_01SequentialSearchExample {

    public static void main(String[] args){

        ArrayList<Integer> list = generateRandomIntegerArrayList();
        printArrayListWithIndexNums(list);

        int randomNum = (int)(Math.random()*90+10);
        System.out.println("What index is the number "+randomNum+" at?");

        int max = 99;
        int min = 10;
        int middle = (int)((max-min)/2.0);
        while(middle==randomNum){
            middle = (int)((max-min)/2.0);
            if(randomNum == middle){

            }

        }


    }

    public static ArrayList<Integer> generateRandomIntegerArrayList(){
        //Constructs an array with the numbers 10 through 99 in order.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 10; i<100; i++){
            do{
                list.add(i);
            }while(Math.random()>0.6);
        }
        return list;
    }

    public static void printArrayListWithIndexNums(ArrayList<Integer> list){
        System.out.println(list.toString());
        System.out.print("  ");
        for(int i=0; i<list.size(); i++){
            if(i<9){
                System.out.print(i+",  ");
            }else if(i<=98){
                System.out.print(i+", ");
            }else{
                System.out.print(i+",");
            }
        }
        System.out.println();
    }

}
