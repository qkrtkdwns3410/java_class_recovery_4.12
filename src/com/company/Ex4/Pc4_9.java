package com.company.Ex4;

public class Pc4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum += num % 10; //sum 에 넘의 나머지숫자를 더하기
            num /= 10;  //num을 10으로 나누기.. 어차피 int형이라 소수점은 다 버려집니다
        }
    
        System.out.println("sum= "+sum);
    }
}
