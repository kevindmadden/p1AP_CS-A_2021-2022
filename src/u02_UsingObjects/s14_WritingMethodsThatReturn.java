package u02_UsingObjects;

public class s14_WritingMethodsThatReturn {
    public static void main(String[] args){

        int num = getRandomInt(1000);
        System.out.println(num);

        int i = 0;
        while(i<100){
            i++;
            boolean isRaining = isItRaining();
            System.out.println(isRaining);
        }

    }

    public static int getRandomInt(int max){
        int randomNum = (int)(Math.random()*max);
        return randomNum;
    }

    public static boolean isItRaining(){
        int num = getRandomInt(2);
        boolean isRaining;
        if(num == 1){
            isRaining = true;
        }else{
            isRaining = false;
        }
        return isRaining;
    }
}
