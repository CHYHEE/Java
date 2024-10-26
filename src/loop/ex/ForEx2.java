package loop.ex;
//10개 짝수 출력 for문
public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

        /* 강의쌤
        for (int num = 2, count = 1; count <=10; num += 2, count++) {
            System.out.println(num);
        }
        */
    }
}
