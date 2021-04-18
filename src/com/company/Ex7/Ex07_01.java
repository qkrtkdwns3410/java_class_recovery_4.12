package com.company.Ex7;

class Tv {
    boolean power;
    int channel;
    
    void power(){
        power = !power;}
    void channelUp() {
        ++channel;
    }
    
    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv { //SmartTv는 Tv에 캡션을 보여주는 기능을 추가한다
    boolean caption;    //캡션 상태 (on/ off)
    
    void displayCaption(String text) {
        if (caption) {      //캡션 상태가 on(true)일때만 text를 보여준다
            System.out.println(text);
        }
    }
}



public class Ex07_01 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world");
        stv.caption = true;
        stv.displayCaption("Hello, world");
    }
}
