package com.company.Ex9;

import javax.smartcardio.Card;
import java.util.Objects;

class Card2 {
    String kind;
    int number;
    
    Card2() {
        this("SPADE", 1);
    }
    
    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    
    //equals를 오버라이딩하면 hashcode()도 오버라이딩해야한다
    public int hashcode() {
        return Objects.hash(kind, number);
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Card2)) {
            return false;
        }
        Card2 c = (Card2) obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }
    
    //Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "kind : " + kind + "number : " + number;
    }
    
    
}
public class Ex9_04 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashcode());
        System.out.println(c2.hashcode());
    }
}
