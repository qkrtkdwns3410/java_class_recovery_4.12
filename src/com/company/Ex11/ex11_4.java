package com.company.Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static com.sun.deploy.util.SessionState.save;

public class ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼수 있습니다.");
    
        while (true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();
        
                if ("".equals(input)) continue;
        
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); //프로그램 종료
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help -도움말을 보여줍니다");
                    System.out.println(" q 또는 Q -프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다");
            
                } else if (input.equalsIgnoreCase("history")) {
                    save(input); //입력받은 명령어를 저장하고,
            
                    //LinkedList의 내용을 보여준다.
                    LinkedList list = (LinkedList) q;
    
                    final int SIZE = list.size(); //반복개수는 고정하는것이 좋습니다.
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("에러발생");
            }
        }
    }
    
    public static void save(String input) {
        //queue에 저장합니다
        if (!"".equals((input))) {
            q.offer(input);
            
            //queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
            if (q.size() > MAX_SIZE) { //size()는 Collection인터페이스에 정의되어 있습니다.
                q.poll();
            }
            
        }
    }
    
}




















