package com.company.Ex7;

class Point {
    int x;
    int y;
    String getLocation() {
        return "x=" + x + ",y=" + y;
    }
}

class Point3D extends Object {
    int x;
    int y;
    
    Point3D(int x, int y) {
        //기본 생성자
    }
    //조상의 getLocation을 오버라이딩합니다
    public  String toString() {
        return "x=" + x + ",y=" + y;
    }
    
}


public class Ex07_01_OverRideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2);
        System.out.println(p);
//        System.out.println("p.x=" + p.x);
//        System.out.println("p.x=" + p.x);
    }
}
