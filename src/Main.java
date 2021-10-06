public class Main {
    public static void main(String[] args) {
        int[] arr = {780, 880, 980};
        System.out.println("Testing to see what your method does...");
        System.out.println(sum3(arr));
        System.out.println("Checking to see if your code returned what we expected...");

    }

    public static int sum3(int[] nums) {
        int sum = nums[0] + nums[1] + nums[2];
        return sum;
    }



}
