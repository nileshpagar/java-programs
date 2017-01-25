package hacker.rank.strings;

import java.util.Arrays;
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


    static boolean _isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }

    static boolean isAnagram(String a,String b)
    {
        char[] chars = (a+ b).toLowerCase().toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i+=2) {
            if (chars[i] != chars[i+1]){
                return false;
            }
        }
        return true;
    }
}
