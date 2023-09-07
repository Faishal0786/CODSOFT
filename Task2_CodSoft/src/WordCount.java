import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text or the path to a file: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        int wordCount = 0;

        for (String word : words) {
            wordCount++;
        }

        // Display the total count of words to the user.
        System.out.println("The number of words is: " + wordCount);
    }
}