package com.company.Ex7;

class Outer {
    static class Inner { //스태틱 클래스는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지않고도 사용할 수 있다.static멤버를 인스턴스 생성없이 사용할 수 있는 것 처럼.
        int iv = 100;
    }
}

public class Prac7_06 {
    public static void main(String[] args) {
        Outer.Inner ii = new Outer.Inner();
        System.out.println(ii.iv);
    }
}
