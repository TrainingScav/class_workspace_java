package exercise;

public class Exercise4 {
    public static void main(String[] args){

        //59.99
        //30% 할인된 가격을 출력 하시오

        final double PRICE = 59.99;

        // 할인 금액 = 원래 가격 × 할인율
        // 할인율은 30%이므로, 이를 0.30으로 표현
        final double DISCOUNT = (PRICE * 0.30);

        //최종 가격 = 원래 가격 - 할인 금액
        System.out.println("할인 금액 : " + (int)(PRICE - DISCOUNT));


    }
}
