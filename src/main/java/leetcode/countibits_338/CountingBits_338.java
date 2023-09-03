package leetcode.countibits_338;

import java.util.Arrays;

import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class CountingBits_338 {


        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            for (int j = 0; j <= n; j++) {
                if (j == 0) { ans[0] = 0; continue;}
                if (j == 1) { ans[1] = 1; continue;}
                int count = 0;
                int temp = j;
                int size = (int)(Math.log(temp)/Math.log(2)) + 1;
                for (int i = size-1; i >= 0; i--) {
                    if(temp >= Math.pow(2, i)) {
                        count++;
                        temp = (int) (temp - Math.pow(2, i));
                    }
                }
                ans[j] = count;
            }
            return ans;
        }


//    public int[] countBits(int n) {
//        int[] ans = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            ans[i] = countOnes(getBinary(i));
//        }
//        return ans;
//    }

    private int countOnes(int[] binary) {
        int count = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) count++;
        }
        return count;
    }

    private static int[] getBinary(int n) {
        int temp = n;
        if (temp <= 0 ) return new int[]{0};
        if (temp == 1 ) return new int[]{1};
        int size = (int)(log(temp)/log(2)) + 1;
        int[] bits = new int[size];
        for (int i = size -1; i >= 0; i--) {
            if(temp >= pow(2, i)) {
                bits[i] = 1;
                temp = (int) (temp - pow(2, i));
            } else {
                bits[i] = 0;
            }
        }
        System.out.println("BINARY VALUE FOR '"+ n + "' is : " +new StringBuilder(stream(bits).mapToObj(String::valueOf).collect(joining(""))).reverse().toString());
        return bits;
    }

    private int _count(int n) {
        if (n <= 0) {
            System.out.print(0);
            return 0;
        }
        else if (n ==1 ) {
            System.out.print(1);
            return 1;
        }
        else {
            System.out.print(1);
            return _count((int) (n - pow(2, n/2 )));
        }
    }

    public static void main(String[] args) {
        CountingBits_338 countingBits338 = new CountingBits_338();
        for (int i = 5; i < 100; i++) {
            countingBits338.countBits(i);
        }
    }

}
