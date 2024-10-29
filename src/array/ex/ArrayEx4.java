package array.ex;

import java.util.Scanner;

//사용자에게 5개의 정수를 입력받아서 합계와 평균을 계산하는 프로그램
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        int total = 0;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            total += num[i];
        }
        double avg = (double) total / num.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
