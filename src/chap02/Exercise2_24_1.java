// 배열을 사용한 방식

package chap02;

import java.util.Scanner;

public class Exercise2_24_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 받을 정수를 받을 배열 선언
        int[] numArr = new int[5];

        // 정수 입력받기
        System.out.print("5개의 정수를 입력하세요.(공백 구분) : ");
        for (int i=0; i<numArr.length; i++)
            numArr[i] = sc.nextInt();

        // 최대값, 최소값을 저장할 변수 선언 및 초기화
        int max = numArr[0];
        int min = numArr[0];

        // 최대값, 최솟값 찾기
        for (int i=1; i<numArr.length; i++) {

            if (max < numArr[i])
                max = numArr[i];
            else if (min > numArr[i])
                min = numArr[i];
        }

        System.out.printf("최대값은 %d이고 최솟값은 %d입니다.\n", max, min);
    }
}
