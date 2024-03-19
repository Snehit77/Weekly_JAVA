import java.util.HashMap;
import java.util.Scanner;
public class Punctuation {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        HashMap<Character, Integer> punctuationCounts = countPunctuation(text);
        printTable(punctuationCounts);
    }
    public static HashMap<Character, Integer> countPunctuation(String text) {
        HashMap<Character, Integer> punctuationCounts = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (isPunctuation(ch)) {
                punctuationCounts.put(ch, punctuationCounts.getOrDefault(ch, 0) + 1);
            }
        }
        return punctuationCounts;
    }
    public static boolean isPunctuation(char ch) {
        return !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch);
    }
    public static void printTable(HashMap<Character, Integer> punctuationCounts) {
        System.out.println("Symbol\t\tCount");
        for (char symbol : punctuationCounts.keySet()) {
            System.out.println(symbol + "\t\t" + punctuationCounts.get(symbol));
        }
    }
}
