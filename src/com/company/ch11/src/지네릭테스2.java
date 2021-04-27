package com.company.ch11.src;


import java.util.ArrayList;
class Tv {}
class Audio{}
public class 지네릭테스2 {
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
        list.add(new Tv());
//        list.add(new Audio());
    
        Tv t = list.get(0);
        
    }
    
    
}







































































