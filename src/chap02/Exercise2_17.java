package chap02;
//2.17 Arithmetic, Smallest and Largest
import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int total, average, product, smallest, largest;
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        num2 = scanner.nextInt();
        System.out.print("세 번째 정수를 입력하세요 : ");
        num3 = scanner.nextInt();

        // total
        total = num1 + num2 + num3;
        System.out.printf("The sum of %d, %d and %d is %d%n", num1, num2, num3, total);

        // average
        average = total / 3;
        System.out.printf("The average of %d, %d and %d is %d%n", num1, num2, num3, average);

        // product
        product = num1 * num2 * num3;
        System.out.printf("The product of %d, %d and %d is %d%n", num1, num2, num3, product);

        int a;
        if(num1 < num2) {
            a = num1;
        } else {
            a = num2;
        }
        if (a < num3) {
            smallest = a;
        } else {
            smallest = num3;
        }
        System.out.printf("The smallest of %d, %d and %d is %d%n", num1, num2, num3, smallest);

        int b;
        if(num1 > num2) {
            b = num1;
        } else {
            b = num2;
        }
        if (b > num3) {
            largest = b;
        } else {
            largest = num3;
        }
        System.out.printf("The largest of %d, %d and %d is %d%n", num1, num2, num3, largest);

    }
}
