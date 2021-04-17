package com.company.Ex6;

class MyPoint {
    int x, y;//인스턴스 변수
    
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    double getDistance(int x1, int y1) { //인스턴스 메서드  --객체 o 위의 x,y까지 사용이 가능합니다.
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(x1 - y, 2));
    }
}
public class Prac06_06 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        
        //p와 (2,2)의 거리를 구한다
        System.out.println(p.getDistance(2,2));
    }
}
