package com.company.Ex6;

public class Prac06_04 {
    //두점 x,y와 x1,y1간의 거리를 구한다
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1 - y,2));
    }
    
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}

