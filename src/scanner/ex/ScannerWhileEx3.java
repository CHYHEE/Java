package scanner.ex;

import java.util.Scanner;
//사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
            input = scanner.nextInt();

            if(input == -1) {
                break;
            }
            sum += input;
            count++;
        }
        /* 축약 가능

        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        */

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
