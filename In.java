import java.util.*;

public class In {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");


        Scanner input = new Scanner(System.in);

        for (String word : words) {
            System.out.println("type " + word + ": ");
            String text = input.nextLine();
            answers.add(text);
        }

        input.close();
        System.out.println("the answers are: ");

        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}