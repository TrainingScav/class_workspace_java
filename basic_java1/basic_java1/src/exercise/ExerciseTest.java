package exercise;

import java.util.Scanner;

public class ExerciseTest {
    public static void main(String[] args) {
        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);


        System.out.println("성적을 입력하세요 : ");
        int score = sc.nextInt(); // 키보드 정수값을 받을 수 있는 명령문
        System.out.println("score:" + score);

        //조건문을 완성해주세여
        //90점이상 -> A 학점입니다.
        if (100 > score) {
            System.out.println("점수를 입력하세요 (0~100) ");
        } else if (90 >= score) {
            System.out.println("A학점입니다");
        } else if (80 >= score) {
            System.out.println("B학점입니다");
        } else if (70 >= score) {
            System.out.println("C학점입니다");
        } else if (60 >= score) {
            System.out.println("D학점입니다");
        } else if (59 >= score) {
            System.out.println("F학점입니다");
        }
    }
}
