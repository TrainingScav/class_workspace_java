package exercise;

public class Exercise7 {
    public static void main(String[] args) {
        // 1. for 구문 1부터 100 까지 반복하는 반복문 작성
        // 만약 i 값이 33이라면 반복문을 멈추는 코드를 작성하시오

        for (int i = 1; i <= 100; i++) {
            System.out.println("i : " + i);
            if (i == 33) {
                break;
            }
        }

        // 2. 1 부터 10까지 숫자중에 홀수면 건너뛰고 짝수만 출력하시오.
        //출력 결과 예시
        // 1는 홀수, 패스!
        // 2는 짝수
        // 3는 홀수, 패스!
        // 4는 짝수
        // 5는 홀수, 패스!
        // 6는 짝수
        // ....
        System.out.println("=============================================");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "는 홀수, 패스!");
                continue;
            }
            System.out.println("짝수 : " + i);
        }
    }
}
