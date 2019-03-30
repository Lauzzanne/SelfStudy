# example question by female

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("기상 시간: ");
        System.out.println("피로도: ");

        int time = scan.nextInt();
        int tiredness = scan.nextInt();
        if (time <= 7 && tiredness < 5) {
            System.out.println("아침먹고 운동하기");
        } else if (time <= 8 && tiredness > 3 && tiredness <= 7) {
            System.out.println("시리얼 먹고 운동하기");
        } else {
            System.out.println("시리얼이라도 먹자");
        }
    }
}
