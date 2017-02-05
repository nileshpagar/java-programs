package hacker.rank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by NileshPagar at gmail dot com on 1/25/17.
 */
public class StringAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOne = scanner.next();
        String stringTwo = scanner.next();
        scanner.close();
        System.out.println(isAnagram(stringOne, stringTwo) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        a=a.toLowerCase();
        b=b.toLowerCase();

        Map<Character, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            note(occurrences, a.charAt(i), true);
            note(occurrences, b.charAt(i), false);
        }
        for (Integer value : occurrences.values()){
            if (value != 0)
                return false;
        }
        return true;
    }

    private static void note(Map<Character, Integer> occurrences, Character key, boolean incrementValue) {
        if (occurrences.containsKey(key)){
            Integer value = occurrences.get(key);
            if (incrementValue)
                value++;
            else
                value--;
            occurrences.put(key, value);
        } else {
            if (incrementValue)
                occurrences.put(key, 1);
            else
                occurrences.put(key, -1);
        }
    }

    static boolean _isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }

    static boolean __isAnagram(String a,String b)
    {
        char[] chars = (a + b).toLowerCase().toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i+=2) {
            if (chars[i] != chars[i+1]){
                return false;
            }
        }
        return true;
    }
}
