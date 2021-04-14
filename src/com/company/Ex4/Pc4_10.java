package com.company.Ex4;

import java.util.Scanner;

public class Pc4_10 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; //사용자 입력을 저장할 공간
        int count = 0;  //시도횟수를 세기위한 변수
        
        //화면으로부터 사용자 입력을 받기 위해서 Scanner클래스 사용
        Scanner s = new Scanner(System.in);
    
        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다
            if (answer > input){
                System.out.println("더 큰 수를 입력하세요");
                continue;
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
                continue;
            }
            System.out.println("맞혔습니다.");
            System.out.println("시도횟수는 " + count + "번입니다");
            break;
        } while (true); //무한반복
    }
}
