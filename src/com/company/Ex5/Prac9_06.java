package com.company.Ex5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac9_06 {
    public static void main(String[] args) {
        String phoneNumArr[] = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2456-9870",
                "031-3456-7890"
        };
    
        Vector list = new Vector(); //  검색결과를 담을 Vector
        Scanner s = new Scanner(System.in); //입력받음.
    
        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();//trim으로 문자제거합니다.
    
            if (input.equals("")) { //같은게 없으면 계속해서..
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
                
            }
            
            //
            String pattern = ".*" + input + ".*"; //input을 포함하는 모든 문자열
            Pattern p = Pattern.compile(pattern);
            for (int i = 0; i < phoneNumArr.length; i++) {
                String phoneNum = phoneNumArr[i];
                String tmp = phoneNum.replace("-", ""); //phoneNum에서 '-'를 제거합니다.
    
                Matcher m = p.matcher(tmp);
                if (m.find()) {         //패턴과 일치하는 부분을 찾으면, list에 phoneNUM을 추가합니다.
                    list.add(phoneNum);
                }
            }
            //
    
            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
        
    }
}













