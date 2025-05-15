package ch07;

public class DogMainTest {

    public static void main(String[] args) {

        // new 생성자 사용, heap 동적 메모리 공간에 들어감
        Dog d1 = new Dog();

        // Dog 객체 멤버변수 3개를 선언 및 초기화
        d1.name = "김멍멍";
        d1.sex = "male";
        d1.age = 4;

        //출력
        System.out.println(d1.name);
        System.out.println(d1.sex);
        System.out.println(d1.age);

    }

}
