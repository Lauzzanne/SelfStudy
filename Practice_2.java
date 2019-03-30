import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("너의 키: ");

        int yourHeight = scan.nextInt();

        if (yourHeight > 166) {
            System.out.println("나보다 키가 크다.");
        }

        else if (yourHeight == 166) {
            System.out.println("나와 키가 같다.");
        }

        else {
            System.out.println("나보다 키가 작다.");
        }

    }

}
