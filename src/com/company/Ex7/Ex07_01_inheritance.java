package com.company.Ex7;

import java.awt.*;

class MyPoint extends Object{
    int x;
    int y;
}

//class Circle extends MyPoint { //상속
//    int r;
//}

class Circle extends Object{ //포함 //Object는 조상입니다.
    MyPoint p = new MyPoint();
    int r;
}


public class Ex07_01_inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString()); //to.String은 오브젝트를 상속받았기때문에 사용이 가능합니다.
    }
}
