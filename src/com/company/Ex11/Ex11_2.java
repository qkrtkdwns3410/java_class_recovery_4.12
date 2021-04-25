package com.company.Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();
        
        st.push("0");
        st.push("0");
        st.push("0");
    
        q.offer("0");
        q.offer("1");
        q.offer("2");
    
        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());//스택에서 요소하나를 꺼냅니다.
        }
        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());//큐에서 요소 하나를 꺼냄.
        }
        
    }
}




























