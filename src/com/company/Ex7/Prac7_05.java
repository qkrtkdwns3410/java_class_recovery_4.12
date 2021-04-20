package com.company.Ex7;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    //(1)알맞은코드를 넣ㅇㅇ
    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            return;
        }
        prevChannel = this.channel; //현재 채널을 prev채널에 담음.
        this.channel = channel; //현재 채널을 매개변수 채널로 변경
    }
    
    public int getChannel() {
        return channel;
    }
    
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
    
}


public class Prac7_05 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        
    }
    
}
