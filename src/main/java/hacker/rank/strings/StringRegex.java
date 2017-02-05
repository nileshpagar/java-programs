package hacker.rank.strings;

import java.util.Scanner;

/**
 * Created by NileshPagar at gmail dot com on 2/5/17.
 *
 * https://www.hackerrank.com/challenges/java-regex
 *
 */
public class StringRegex {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {
        public String pattern =
                "((0?[0-9]?[0-9])?|(1[0-9][0-9])?|(2[0-5][0-5])?)" +
                "\\." +
                "((0?[0-9]?[0-9])?|(1[0-9][0-9])?|(2[0-5][0-5])?)" +
                "\\." +
                "((0?[0-9]?[0-9])?|(1[0-9][0-9])?|(2[0-5][0-5])?)" +
                "\\." +
                "((0?[0-9]?[0-9])?|(1[0-9][0-9])?|(2[0-5][0-5])?)";
    }
}
