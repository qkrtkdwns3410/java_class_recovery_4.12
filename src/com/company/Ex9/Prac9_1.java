package com.company.Ex9;
public class Prac9_1 {
    public static void main(String[] args) {
        SutdaCard2 c1 = new SutdaCard2();
        SutdaCard2 c2 = new SutdaCard2();
    
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;
    
    SutdaCard2() {
        this(1, true);
    }
    
    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public boolean equals(Object o) {
        if (o instanceof SutdaCard2) {
            SutdaCard2 c = (SutdaCard2) o;
            return num == c.num && isKwang == c.isKwang;
        }
        return false;
    }
    
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
    
}

