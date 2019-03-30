// Array & for practice by Female

import java.util.Scanner;

public class introToArray {
    public static void main(String[] args) {
        int[] integers = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int index = 0; index < integers.length; index++) {
            if (integers[index] <= 50) {
                System.out.println("50보다 작거나 같다.");
            }
            else {
                System.out.println("50보다 크다.");
            }
        }
    }
}
