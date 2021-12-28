package chap01;
// 2.15 Arithmetic
import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.printf("첫 번째 정수를 입력하세요. : ");
       int num1 = scanner.nextInt();

       System.out.printf("두 번째 정수를 입력하세요 : ");
       int num2 = scanner.nextInt();

       int squareNum1 = num1 * num1;
       int squareNum2 = num2 * num2;
       int totalSquareNum = squareNum1 + squareNum2;
       int remainderSquareNum = squareNum1 - squareNum2;

       System.out.printf("%d, %d의 각각의 제곱은 %d %d이고, 제곱의 합은 %d, 제곱의 차는 %d입니다.", num1, num2, squareNum1, squareNum2, totalSquareNum, remainderSquareNum);
    }
}
