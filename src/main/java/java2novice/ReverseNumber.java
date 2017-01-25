package java2novice;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by NileshPagar at gmail dot com on 1/25/17.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("input an integer to reverse : ");
        Integer number = scanner.nextInt();
        scanner.close();
        System.out.printf("Reversed number is %d", reverseInteger(number));
    }

    private static Integer reverseInteger(Integer number) {
        Integer reversedNumber = 0;
        while (number > 0){
            number = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

}
