import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        String result = reversedSentence.toString().trim();
        System.out.println("Reversed sentence: " + result);

        scan.close();
    }
}
