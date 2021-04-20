package com.company.Ex7;

class Product11 {
    public int bounusPoint1;
    int price;
    int bonusPoint;
    
    Product11() {
    
    }
    
    Product11(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv11 extends Product11 {
    Tv11(){}   //기본형
    
    public String toString() {
        return "Tv";
    }
}





public class Prac7_03 {
    public static void main(String[] args) {
        Tv11 t = new Tv11();
    }
}
