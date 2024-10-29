package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.println(number + "개의 정수를 입력하세요: ");

        int max, min;

        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 1; i < number; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
