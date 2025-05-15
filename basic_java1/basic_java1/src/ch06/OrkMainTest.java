package ch06;

public class OrkMainTest {
    public static void main(String[] args) {
        Ork ork1 = new Ork();

        // 오크의 멤버변수에 값 할당
        ork1.sex = "male";
        ork1.name = "Kim Ork";
        ork1.nickNm = "meatBoy";
        ork1.age = 30;
        ork1.birthDate = 19950510;
        ork1.skinCol = "Green";
        ork1.isDieYn = 'N';
        ork1.lifeStory = "적을 도륙하기 위해 태어난 오크다";

        // 오크의 멤버변수에 값 할당 확인
        System.out.println(ork1.sex);
        System.out.println(ork1.name);
        System.out.println(ork1.nickNm);
        System.out.println(ork1.age);
        System.out.println(ork1.skinCol);
        System.out.println(ork1.isDieYn);
        System.out.println(ork1.lifeStory);
    }
}
