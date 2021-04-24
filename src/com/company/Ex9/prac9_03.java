package com.company.Ex9;

public class prac9_03 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
        
    
    }
    
    public static int count(String src, String target) {
        int count = 0; //찾은 횟수
        int pos = 0; //찾기 시작할 위치
        while (true) {
            pos = src.indexOf(target, pos); //src에서 target을 pos의 위치부터 찾는다
            if (pos != -1) {
                count += 1;
                pos += target.length();
        
            } else {
                break;
            }
            
        }
        return count;
    }
}




















