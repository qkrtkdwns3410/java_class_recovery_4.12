package com.company.Ex6;

class Car {
    String color;
    String gearType;
    int door; //문의 개수
    
    Car(){} //기본 생성자
    
    Car(String c,String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
    
}

public class Ex06_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "White";
        c1.gearType = "auto";
        c1.door = 4;
    
        Car c2 = new Car("White", "auto", 4);
    
        System.out.printf("c1의 color=%s, gearType=%s, door=%d\n\n",c1.color,c1.gearType,c1.door);
        System.out.printf("c2의 color=%s, gearType=%s, door=%d",c2.color,c2.gearType,c2.door);
    }
}
