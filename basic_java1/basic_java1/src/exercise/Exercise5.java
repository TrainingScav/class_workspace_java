package exercise;

public class Exercise5 {
    public static void main(String[] args) {
        //1.문제
        // 잔고가 1000원인 영희의 월급은 10000원이고 매달 10일에 입금 된다.
        // 아쉽게도 카드값이 나가는 날은 11일이고 고정지출 5000원씩 나간다.
        // 현재는 1월 9일이고 5월 12일이 되면 영희의 잔고는 얼마일까?

        //현재 잔고 (1월 9일 기준)
        int balance = 1000;

        // 매월 11일날 5000원 고정으로 나감
        int payment = 5000;

        // 매달 들어오는 월급( 매월 10일)
        int salary = 10000;

        // 복합대입 연산자를 활용하여 변수 값 설정
        payment *=5;
        salary *=5;

        //       현재 잔액  월급 * 5개월 지출 * 5개월
        balance = balance + (salary - payment);

        System.out.println("현재 잔액은? : " + balance);
    }
}
