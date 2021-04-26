package com.company.Ex11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
    
        set.add("abc");
        set.add("abc"); //중복이라 저장안됨
        set.add(new Person("David", 10));
        set.add(new Person("David",10));
    
        System.out.println(set);
    }
}


//equals 와 hasCode()를 오버라이딩해야 HashSet이 바르게 동작합니다

class Person {
    String name;
    int age;
    
    @Override
    public int hashCode() {
        // int hash(object... values);//가변인자
        return Objects.hash(name, age);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  Person)) return false;
        Person p = (Person) obj;
    
        return this.name.equals(p.name) && this.age == p.age;
    }
    
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + ":" + age;
    }
}























