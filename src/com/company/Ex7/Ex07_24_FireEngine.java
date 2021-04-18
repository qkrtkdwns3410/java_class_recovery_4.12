package com.company.Ex7;

class Car {
    String color;
    int door;
    
    void drive() {  //운전기능
        System.out.println("drive, Brrrrr~");
    }
    
    void stop() {   //멈추는 기능
        System.out.println("stop~!!");
    }
}

class FireEngine extends Car {  //소방차
    void water() {  //물뿌리는 기능
        System.out.println("water!!!");
    }
}


public class Ex07_24_FireEngine {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
    
        fe.water();
        car = fe;
//      car.water(); //car타입의 참조변수로는 water()를 호출할 수 없다
        fe2 = (FireEngine) car; //자손 타입 <<조상타입, 형변환 생략불가능합니다
        fe2.water();
    }
}
