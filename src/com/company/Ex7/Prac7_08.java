package com.company.Ex7;

class Outer1 {
    int value = 10;
    
    class Inner {
        int value = 20;
    
        void method() {
            int value = 30;
    
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer1.this.value);
        }
    }
}
public class Prac7_08 {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner inner = o.new Inner();
        inner.method();
    }
}









