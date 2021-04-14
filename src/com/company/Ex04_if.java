package com.company;

import java.util.Scanner;

public class Ex04_if {
    public static void main(String[] args) {
//        System.out.printf("숫자를 하나 입력하세요.>");
//        Scanner scanner =new Scanner(System.in);
//        int input =scanner.nextInt(); //화면을 통해 입력받은 숫자를 input에 저장합니다
//
//        if(input==0){
//            System.out.printf("입력하신 숫자는 0입니다");
//        }else{
//            System.out.printf("입력하신 숫자는 0이 아닙니다");
//        }
//

//        int score =0;
//        char grade =' ';
//
//        System.out.printf("점수를 입력하세요.:");
//        Scanner scanner =new Scanner(System.in);
//        score =scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
//
//        if(score >=90){
//            grade ='A';
//        }else if (score>=80){
//            grade='B';
//        }else if (score>=70){
//            grade='C';
//        }else{
//            grade='D';
//        }
//        System.out.printf("당신의 학점은 "+grade+"입니다.");
        
        int score = 0;
        char grade = ' ', opt = '0';
        System.out.printf("점수를 입력해주세요>>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        
        System.out.printf("당신의 점수는 %d입니다\n", score);
        
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-'
            }
        } else {
            grade = 'C';
            
        }
        
        
    }
}










