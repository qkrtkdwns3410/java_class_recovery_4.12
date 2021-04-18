package pkg2;

import pkg1.MyParentTest;

class Child extends MyParentTest {
    @Override
    public void printMembers() {
//        System.out.println(prv); //같은 클래스 내에서만 가능
//        System.out.println(dft); //같은 패키지내
        System.out.println(prt); //같은 패키지 다른 패키지의 자손클래스
        System.out.println(pub); //all Free
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParentTest p = new MyParentTest();
//
//        System.out.println(p.prv); //같은 클래스 내에서만 가능
//        System.out.println(p.dft); //같은 패키지내
//        System.out.println(p.prt); //같은 패키지 다른 패키지의 자손클래스
        System.out.println(p.pub); //all Free
    }
}
