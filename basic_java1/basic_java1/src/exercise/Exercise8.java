package exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // 프로그래밍에서는 C R U D 개념이 있다.
        // 생성, 조회, 수정, 삭제
        // 실행에 흐름을 만들어 보는 연습 1단계

        // 1. 스캐너
        // 2. WHILE
        // 3. 만약 ... if 구문 활용

        // 사용자 값을 받기위한 스캐너 세팅
        Scanner sc = new Scanner(System.in);

        // while 진행 여부 판단하는 변수
        // 다른 C R U D 선택 시 다시 선택하도록 해야함
        // 프로그램 종료를 선택 시 break가 되기 때문에 while문 안에서 변경해야할 필요성이 있는지 고민필요

        boolean flag = true;

        while (flag) {
            // 화면에 출력할 문구 세팅
            System.out.println("메뉴 선택");
            System.out.print("1.등록 ");
            System.out.print("2.조회 ");
            System.out.print("3.수정 ");
            System.out.print("4.삭제 ");
            System.out.println("0.종료 ");
            System.out.print("선택 : ");

            // 사용자의 값을 입력 받음
            int selNum = sc.nextInt();

            // 사용자의 입력값에 따라 처리 진행
            if (selNum == 1) {
                System.out.println("등록을 선택 했습니다.");
            } else if (selNum == 2) {
                System.out.println("조회를 선택 했습니다.");
            } else if (selNum == 3) {
                System.out.println("수정을 선택 했습니다.");
            } else if (selNum == 4) {
                System.out.println("삭제를 선택 했습니다.");
            } else if (selNum == 0) {
                System.out.println("프로그램을 종료합니다");
                //break;
                // break 대신 변수로 while 제어 시 아래의 코드 작성
                flag = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println("================================================");
        }


    } // end of main
} // end of class
