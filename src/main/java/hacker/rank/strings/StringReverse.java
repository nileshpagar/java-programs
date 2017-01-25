package hacker.rank.strings;

import java.util.Scanner;

/**
 * Created by I558472 on 1/23/2017.
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        long time = System.nanoTime();
        System.out.println(reverseStringWithNComplexity(A));
        System.out.printf("N complexity algo, completed in %d nano seconds%n",System.nanoTime() - time);
        time = System.nanoTime();
        System.out.println(reverseStringWithNBy2Complexity(A));
        System.out.printf("N/2 complexity algo, completed in %d nano seconds%n",System.nanoTime() - time);
    }

    private static String reverseStringWithNComplexity(String a) {
        String reversedA = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reversedA += a.charAt(i);
        }
        return reversedA;
    }

    private static String reverseStringWithNBy2Complexity(String a) {
        char[] reversed = new char[a.length()];
        for (int i=0,j=a.length()-1;  j-i>=0;  i++,j--) {
            reversed[i] = a.charAt(j);
            reversed[j] = a.charAt(i);
        }
        return String.valueOf(reversed);
    }

}
