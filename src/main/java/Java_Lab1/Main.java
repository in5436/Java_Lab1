package Java_Lab1;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] inputWords = {"java", "hello", "world", "unique", "code", "list"};

        List<String> uniqueWordsList = new ArrayList<>();

        for (String word : inputWords) {
            if (hasAllUniqueChars(word)) {
                uniqueWordsList.add(word);
            }
        }

        String[] resultArray = uniqueWordsList.toArray(new String[0]);

        System.out.println("Слова з унікальними символами:");
        System.out.println(Arrays.toString(resultArray));
    }

    public static boolean hasAllUniqueChars(String word) {

        Set<Character> uniqueChars = new HashSet<>();

        for (char c : word.toCharArray()) {
            uniqueChars.add(c);
        }

        return word.length() == uniqueChars.size();
    }
}
