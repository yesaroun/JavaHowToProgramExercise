package chap01;
// 2.16 Comparing Integers
import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        if (num1 > 100) {
            System.out.printf("%d > 100", num1);
        } else if (num1 == 100) {
            System.out.printf("%d = 100", num1);
        } else {
            System.out.printf("%d < 100", num1);
        }

        int num2 = num1 * num1;
        if (num2 > 100) {
            System.out.printf("%n%d^2 > 100", num1);
        } else if (num2 == 100) {
            System.out.printf("%n%d^2 = 100", num1);
        } else {
            System.out.printf("%n%d^2 < 100", num1);
        }
    }
}
