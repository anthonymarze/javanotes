public class Average {
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("Average: " + answer );
    }

    public static double average(int num1, int num2, int num3, int num4) {
        int[] nums = {num1, num2, num3, num4};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return (double) sum / nums.length;
    }
}