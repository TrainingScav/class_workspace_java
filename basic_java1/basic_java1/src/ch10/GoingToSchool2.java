package ch10;

public class GoingToSchool2 {
    public static void main(String[] args) {
        // 버스 객체를 3개 생성해 보시오
        Bus b1 = new Bus(33);
        Bus b2 = new Bus(89);
        Bus b3 = new Bus(1004);
        // 학생 객체를 2명 생성해 보시오
        Student s1 = new Student("이기영", 3500);
        Student s2 = new Student("이기철", 4000);

        // 학생이 버스를 타는 행위를 만들어 보세요
        s1.takeBus(b1);
        s2.takeBus(b2);
        // 버스의 상태창을 출력해서 결과를 확인해 보자.
        b1.showInfo();
        b2.showInfo();
    }

}
