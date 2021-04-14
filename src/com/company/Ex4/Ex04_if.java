package com.company.Ex4;

import java.util. *;
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

//        int score = 0;
//        char grade = ' ', opt = '0';
//        System.out.printf("점수를 입력해주세요>>");
//        Scanner scanner = new Scanner(System.in);
//        score = scanner.nextInt();
//
//        System.out.printf("당신의 점수는 %d입니다\n", score);
//
//        if (score >= 90) {
//            grade = 'A';
//            if (score >= 98) {
//                opt = '+';
//            } else if (score < 94) {
//                opt = '-';
//            }
//        } else if (score >= 80) {
//            grade = 'B';
//            if (score >= 88) {
//                opt = '+';
//            } else if (score < 84) {
//                opt = '-';
//            }
//        } else {
//            grade = 'C';
//        }
//        System.out.printf("당신의 학점은 %c%c입니다\n", grade, opt);
//
//

//        System.out.printf("현재 월을 입력하세요.>");
//
//        Scanner scanner =new Scanner(System.in);
//        int month = scanner.nextInt();  //화면을 통해 입력받은 숫자를 month에 저장합니다
//
//        switch (month){
//            case 3:
//            case 4:
//            case 5:
//                System.out.printf("현재 계절은 봄입니다");
//                break;
//            case 6: case 7:
//            case 8:
//                System.out.printf("현재 계절은 여름입니다");
//                break;
//            case 9: case 10:
//            case 11:
//                System.out.printf("현재의 계절은 가을입니다");
//            default:
//            case 12: case 1:  case 2:
//                System.out.printf("현재의 계절은 겨울입니다");
//        }


//        int num = 0;
//
//        //괄호의 내용을 5번 반복합니다
//        for (int i =1;i<=5;i++){
//            num = (int) (Math.random() * 6) + 1;
//            System.out.println(num);
//        }
//

//        for (int i=0;i<4;i++){
//            System.out.println("hello");
//        }
        
//        int sum = 0;
//
//        for (int i = 1; i < 6; i++) {
//            sum += i;
//            System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
//
//        }
        
        
//        for (int i=1;i<6;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );;
//        }
//
    
    
//        int sum = 0;
//        int i = 0;
//
//        while (sum <= 100) {
//            System.out.printf("%d - %d\n", i, sum);
//            sum += ++i;
//
//        }
//        int num = 0, sum = 0;
//        System.out.printf("숫자를 입력하세요.(예:12345)>>");
//        Scanner scanner = new Scanner(System.in);
//        String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
//        num = Integer.parseInt(tmp); //입력받은 문자열 (tmp)을 숫자로 변환
//
//        while (num != 0) {
//            //num을 10으로 나눈 나머지를 sum에 더합니다
//            sum += num % 10;
//            System.out.printf("sum=%3d num%d\n", sum, num);
//
//            num /= 10;
//
//        }
//        System.out.println("각 자리수의 합:"+sum);
//
    
//        int input = 0, answer = 0;
//
//        answer = (int) (Math.random() * 100) + 1; //1~100사이의 임의의 수를 저장합니다
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("1과 100 사이의 정수를 입력하세요>");
//            input = scanner.nextInt();
//
//            if (input > answer) {
//                System.out.println("더 작은 수로 다시 시도해 보세요.");
//            } else if (input < answer) {
//                System.out.println("더 큰 수로 다시 시도해 보세요.");
//            }
//        } while (input != answer);
//
//        System.out.println("정답입니다.");
    
    
//        int menu = 0;
//        int num = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("(1) square");
//            System.out.println("(2) square root");
//            System.out.println("(3) log");
//            System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
//
//            String tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp에 저장
//            menu = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
//
//            if (menu == 0) {
//                System.out.println("프로그램을 종료합니다");
//                break;
//            } else if (!(1 <= menu && menu <= 3)) {
//                System.out.println("메뉴를 잘못 선택하셨습니다(종료는 0)");
//                continue;
//            }
//            System.out.println("선택하신 메뉴는"+menu+"입니다");
//        }
    
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        
        outer: //while문에 outer라는 이름을 붙인다
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
    
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);
    
            if (menu==0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)!");
                continue;
            }
            
            for(;;){
                System.out.println("계산할 값을 입력하세요.(계산종료:0, 전체종료:99)>");
                tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp에 저장
                num = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 저장
    
                if (num == 0) {
                    break;
                }
    
                if (num == 99) {
                    break outer;
                }
                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
                
                
            }
        }
        
        
        
        
        
        
        }
    }












