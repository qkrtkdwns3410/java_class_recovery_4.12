package com.company.Ex6;

class MyTv {
    boolean isPowerON;
    int channel;
    int volume;
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    
    void turnOnOff() {
        if (isPowerON == false) {
            isPowerON = true;
            System.out.println("tv가 켜졌습니다");
        } else if (isPowerON == true) {
            isPowerON = false;
            System.out.println("tv가 꺼졌습니다");
        }
    }
    
    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }
    
    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }
    
    void channelUp() {
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
    }
    void channelDown() {
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
    }
    
    
}//my tv class

public class Prac06_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
    
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH" + t.channel + ", VOL:" + t.volume);
    
        t.channelDown();
        t.volumeDown();
        System.out.println("CH" + t.channel + ", VOL:" + t.volume);
    
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH" + t.channel + ", VOL:" + t.volume);
    
    }
    
}
