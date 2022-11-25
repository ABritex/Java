package Java.TestLab;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num[] = { 2, 4, -3, 4, 16, 100 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }

}
