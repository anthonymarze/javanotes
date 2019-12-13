public class Least {
    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println(answer);
    }

    public static int least(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}