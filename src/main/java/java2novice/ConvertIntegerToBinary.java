package java2novice;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by NileshPagar at gmail dot com on 1/25/17.
 */
public class ConvertIntegerToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int binary = 0;
        for (int i = 63; i >= 0; i--) {
            int value = (int) pow(2, i);
            if(value <= number){
                binary += (int)pow(10, i);
                number = number - value;
            }
        }
        System.out.println(binary);
    }

}
