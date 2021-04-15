package com.company.Ex5;

import java.util.Scanner;

public class Ex05_10 {
    public static void main(String[] args) {
        String words[][] = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };
    
        Scanner sc = new Scanner(System.in);
    
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
    
            String tmp = sc.nextLine(); //정답을 입력받습니다
    
            if (tmp.equals(words[i][1])) { //정답과 같다면
                System.out.printf("정답입니다.\n\n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n",words[i][1]);
            }
        }
    }
}














