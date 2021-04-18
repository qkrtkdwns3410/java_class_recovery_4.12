package com.company.Ex7;

class Time {
    private int hour; //0~23사이의 값을 가져야함
    private int minute;
    private int second;
    
    public void setHour(int hour) {
        if (isNotValidHour(hour)) return; //아무런값도 반환하지않음 >>잘못된 값이기에
        this.hour = hour; //0~23사이의 값이라면 hour를 저장합니다.
    }
    
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23; //hour가 0~23사이가 아니면 참을 보낸다
    }
    
    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 100;
        t.setHour(21); //hour의 값을 21로 변경합니다
        System.out.println(t.getHour());
    }
}
