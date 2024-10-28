package scanner.ex;

import java.util.Scanner;

//사용자로부터 상품 정보를 입력받고, 총 가격을 출력하는 프로그램
//+ 결제 옵션을 선택하면 총 비용을 출력하고 총 비용을 0으로 초기화
public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int price;
        int quantity;
        int total = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명을 입력하세요: ");
                name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                quantity = scanner.nextInt();

                total += quantity * price;

                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
                total = 0;

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
