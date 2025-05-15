package ch07;

public class FunctionMainTest3 {

    public static void main(String[] args) {
        plus(1,2);
        minus(4,2);
        division(4,2);
        multiply(2,2);
    }

    // 함수를 만들어 보세요

    // 덧셈 연산 기능
    static void plus(int n1, int n2){
        System.out.println("더한 결과 : " + (n1+n2) );
    }
    // 뺄셈 연산 기능
    static void minus(int n1, int n2) {
        System.out.println("뺀 결과 : " + (n1-n2) );
    }
    // 나눗셈 연산 기능
    static void division(int n1, int n2) {
        System.out.println("나눈 결과 : " + (n1/n2) );
    }
    // 곱하는 연산 기능
    static void multiply(int n1, int n2) {
        System.out.println("곱한 결과 : " + (n1*n2) );
    }
}
