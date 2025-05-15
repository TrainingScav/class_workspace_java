package ch09;

public class BusMainTest {

    // 생성자를 사용하는 목적은
    // 강제성을 부여하기 위함이다
    public static void main(String[] args) {
        Bus b1 = new Bus(133, "시내버스","텐코");
        b1.showInfo();
    } // end of main

} // end of class
