package exercise;


import java.util.Scanner;


public class TestExercise {


    public static void main(String[] args) {
        // 사용자의 성적 입력값을 받는 메서드 실행
        chkGrade();

    } // end of main


    // 입력한 값에 해당하는 성적을 계산하는 메서드
    public static void chkGrade() {

        // 성적 결과를 넣어주기 위한 변수 선언
        String gradeChk = null;


        //사용자가 입력한 정수값을 받음
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력 해주세요. (정수로 입력 해주세요)");
        System.out.print("성적 입력 : ");

        int point = sc.nextInt();

        // 0~100 사이로 입력을 하였는지 validation 체크
        // 이 후 차례대로 해당하는 A~F 성적 확인 후 프로그램 종료 출력
        if (point < 0 || point > 100) {

            gradeChk = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력 해주세요.";
            System.out.println(gradeChk);
            chkYn();

        } else if (point >= 90 && point <= 100) {

            gradeChk = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
            System.out.println(gradeChk);
            chkYn();

        } else if (point >= 80 && point < 90) {

            gradeChk = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
            System.out.println(gradeChk);
            chkYn();

        } else if (point >= 70 && point < 80) {
            gradeChk = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
            System.out.println(gradeChk);
            chkYn();
        } else if (point >= 60 && point < 70) {
            gradeChk = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
            System.out.println(gradeChk);
            chkYn();
        } else {
            gradeChk = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
            System.out.println(gradeChk);
            chkYn();
        }
        return;

    }


    // 진행 여부를 판단하는 메서드
    public static void chkYn() {
        Scanner sc = new Scanner(System.in);

        // yn 입력을 받기위한 문자열 선언
        System.out.println("계속 진행하시겠습니까? (y or n 입력)");
        System.out.print("입력 : ");

        String yn = sc.nextLine().toLowerCase();

        // 입력값이 y,n이 아닐경우 체크
        if (!yn.equals("y") && !yn.equals("n")) {
            System.out.println("올바른 입력이 아닙니다.");
            System.out.println("프로그램 종료");
        } else {
            if (yn.equals("y")) {
                System.out.println("계속 진행합니다.");
                chkGrade();
            } else {
                System.out.println("프로그램 종료");
            }

        }
        return;
    }


} // end of class


