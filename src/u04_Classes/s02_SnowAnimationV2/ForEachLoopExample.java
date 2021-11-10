package u04_Classes.s02_SnowAnimationV2;

public class ForEachLoopExample {

    public static void main(String[] args){

        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++){
            nums[i] = i*2;
        }

        //Normal for-loop
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        //For-each loop
        for(int num : nums){
            System.out.println(num);
        }

        //These two for-loops do the exact same thing!


    }

}
