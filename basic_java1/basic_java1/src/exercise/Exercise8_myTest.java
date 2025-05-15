package exercise;

import java.util.Scanner;

public class Exercise8_myTest {
    public static void main(String[] args) {

        // 오크의 인적사항을 등록하는 프로그램 제작
        // 이전에 만든 C R U D 코드 활용
        // 1. 등록을 눌렀을 시 만약 오크의 인적사항이 등록 되어 있다면 "이미 등록된 인적사항이 있습니다." 출력
        //    오크의 이름, 성별, 나이를 입력 받아서 등록
        // 2. 조회를 누를 시 만약 오크의 인적사항이 등록되지 않았다면 "인적사항 등록 후 이용 해주세요." 출력
        //    존재 할 시 등록하였던 오크의 이름,성별,나이 출력
        // 3. 수정을 누를 시 만약 오크의 인적사항이 등록되지 않았다면 "인적사항 등록 후 이용 해주세요." 출력
        //    존재 할 시 1. 이름, 2. 성별, 3. 나이 를 선택 후 변경하고 싶은 값으로 변경 되도록 설정
        // 4. 삭제를 누를 시 만약 오크의 인적사항이 등록되지 않았다면 "인적사항 등록 후 이용 해주세요." 출력
        //    존재 할 시 기존에 등록된 오크의 정보를 초기값으로 세팅
        //    ex : ork1.name = null


        // 사용자 값을 받기위한 스캐너 세팅
        Scanner sc = new Scanner(System.in);

        // while 제어를 위한 flag 변수 선언 및 초기화
        boolean flag = true;

        // 오크 객체 생성
        Ork_Exercise makeOrk1 = new Ork_Exercise();

        while (flag) {

            //오크 객체
            String name = makeOrk1.name;
            String sex = makeOrk1.sex;
            int age = makeOrk1.age;

            // 화면에 출력할 문구 세팅
            System.out.println("오크 인적사항 등록 프로그램");
            System.out.println("현재는 테스트 버전으로 정보 한번만 등록이 가능합니다.");
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
                if (makeOrk1.name == null && makeOrk1.sex == null && makeOrk1.age == 0) {
                    System.out.println("등록을 선택 했습니다.");
                    System.out.println("등록 하실 오크의 정보를 입력 해주세요.");

                    // 오크의 이름 설정
                    System.out.print("오크의 이름은? : ");
                    String selName = sc.next();
                    makeOrk1.name = selName;
                    System.out.println();

                    // 오크의 성별 설정
                    System.out.print("오크의 성별은? (male, female 중 하나 입력) : ");
                    String selSex = sc.next();
                    makeOrk1.sex = selSex;
                    System.out.println();

                    // 오크의 나이 설정
                    System.out.print("오크의 나이는? : ");
                    int selAge = sc.nextInt();
                    makeOrk1.age = selAge;
                    System.out.println();

                    System.out.println("입력이 완료 되었습니다.");
                } else {
                    System.out.println("이미 입력된 인적 사항이 있습니다.");
                }
            } else if (selNum == 2) {
                if (makeOrk1.name == null && makeOrk1.sex == null && makeOrk1.age == 0) {
                    System.out.println("등록된 오크의 정보가 없습니다. 등록 후 시도 해주세요.");
                } else {
                    System.out.println("현재 등록된 오크의 정보는 아래와 같습니다.");
                    System.out.println("오크의 이름 : " + makeOrk1.name);
                    System.out.println("오크의 성별 : " + makeOrk1.sex);
                    System.out.println("오크의 나이 : " + makeOrk1.age);
                }
            } else if (selNum == 3) {
                if (makeOrk1.name == null && makeOrk1.sex == null && makeOrk1.age == 0) {
                    System.out.println("등록된 오크의 정보가 없습니다. 등록 후 시도 해주세요.");
                } else {
                    System.out.println("수정하실 정보를 선택 해주세요.");
                    System.out.println("1. 이름, 2. 성별, 3,나이 ");
                    System.out.print("입력 : ");
                    int selModNum = sc.nextInt();

                    if (selModNum == 1) {
                        System.out.println("수정하실 이름을 입력 해 주세요.");
                        System.out.print("입력 : ");
                        String modName = sc.next();
                        makeOrk1.name = modName;
                        System.out.println("수정 되었습니다.");
                    } else if (selModNum == 2) {
                        System.out.println("수정하실 성별을 입력 해 주세요. (male or female)");
                        System.out.print("입력 : ");
                        String modSex = sc.next();
                        makeOrk1.sex = modSex;
                        System.out.println("수정 되었습니다.");
                    } else if (selModNum == 3) {
                        System.out.println("수정하실 나이를 입력 해 주세요.");
                        System.out.print("입력 : ");
                        int modAge = sc.nextInt();
                        makeOrk1.age = modAge;
                        System.out.println("수정 되었습니다.");
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                }
            } else if (selNum == 4) {
                if (makeOrk1.name == null && makeOrk1.sex == null && makeOrk1.age == 0) {
                    System.out.println("등록된 오크의 정보가 없습니다. 등록 후 시도 해주세요.");
                } else {
                    makeOrk1.name = null;
                    makeOrk1.sex = null;
                    makeOrk1.age = 0;
                    System.out.println("오크 정보를 삭제 하였습니다.");
                }
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
