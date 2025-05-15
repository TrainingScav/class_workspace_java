package exercise;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        // 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 1. 이름 입력을 받고 greet 함수를 호출
        //System.out.print("이름을 입력 해 주세요 : ");
        //String myName = sc.next();
        //greet(myName);

        // 2. 입력된 수의 제곱을 출력
        //System.out.print("숫자를 입력 해 주세요 : ");
        //int num = sc.nextInt();
        //int resultNum = a(num);
        //System.out.println("resultNum : " + resultNum);

        // 3. 입력된 수의 부호 판별
        //System.out.print("숫자를 입력 해 주세요 : ");
        //int num = sc.nextInt();
        //String pnzResult = chkPNZ(num);
        //System.out.println("입력하신 값의 부호는 : " + pnzResult);

        // 4. 입력된 수의 나이 확인 (18세 이상일 시 true 아니면 false)
        //System.out.print("숫자를 입력 해 주세요 : ");
        //int num2 = sc.nextInt();
        //boolean resultTF = checkAdult(num2);
        //System.out.println("성인여부 : " + resultTF);

        // 5. 입력된 수의 최대값 찾기
        System.out.print("첫 번째 숫자를 입력 해 주세요 : ");
        int num3 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력 해 주세요 : ");
        int num4 = sc.nextInt();

        int resultMaxNum = findMax(num3,num4);
        System.out.println("두 수 중 최대값은 : " + resultMaxNum);
    }

    static void greet(String nm) {
        System.out.println("안녕하세요 [ " + nm + " ] 님");
    }

    static int a(int n1) {
        return n1 * n1;
    }

    static String chkPNZ(int n1) {

        String result = "";

        if (n1 > 0) {
            result = "positive";
        } else if (n1 < 0) {
            result = "negative";
        } else if (n1 == 0) {
            result =  "zero";
        }

        return result;
    }

    static boolean checkAdult(int n1) {
        boolean result;

        if (n1 >= 18) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    static int findMax(int n1, int n2) {
        int result;

        result = n1 > n2 ? n1 : n2;

        return result;
    }

}
