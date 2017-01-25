package java2novice;

import java.util.Scanner;

/**
 * Created by nileshpagar on 1/25/17.
 */
public class ConvertBinaryToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        scanner.close();
        int number = 0;
        char[] chars = String.valueOf(binary).toCharArray();
        for (int i = chars.length-1, j=0; i >=0 ; i--,j++) {
            if (chars[j] == '1')
                number += Math.pow(2, i) * 1;
        }
        System.out.println(number);
    }

}
