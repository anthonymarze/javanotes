import java.util.*;

public class In {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(words);
        input.close();
    }
}