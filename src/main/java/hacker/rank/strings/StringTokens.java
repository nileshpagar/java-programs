package hacker.rank.strings;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by NileshPagar at gmail dot com on 1/26/17.
 *
 * https://www.hackerrank.com/challenges/java-string-tokens
 *
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String input = scan.nextLine();
        scan.close();
        __tokenizeAlbhabeticalStrings(input);
    }

    private static void tokenizeAlbhabeticalStrings(String input) {
        String[] strings = input.split("([ !,?._'@])");
        out.println(strings.length);
        Arrays.stream(strings).forEach(out::println);
    }

    private static void _tokenizeAlbhabeticalStrings(String input) {
        List<String> strings = new ArrayList<>();
        String token = "";
        for (int i = 0; i < input.length(); i++) {
            String literal = input.substring(i, i + 1);
            if (literal.matches("[A-Za-z]+")){
                token = token + literal;
            } else if(!"".equals(token  )){
                strings.add(token);
                token = "";
            }
        }
        if(!"".equals(token  )){
            strings.add(token);
        }
        out.println(strings.size());
        strings.forEach(out::println);
    }

    private static void __tokenizeAlbhabeticalStrings(String input) {
        StringTokenizer stringTokenizer = new StringTokenizer(input, " !,?._'@");
        out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreElements()){
            out.println(stringTokenizer.nextToken());
        }
    }

}
