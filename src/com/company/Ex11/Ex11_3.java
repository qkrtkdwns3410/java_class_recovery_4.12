package com.company.Ex11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        Stack st = new Stack();
        String expression = "((3+5)*-2)"; //여는 괄호 push 닫은 괄호 pop
        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
            
                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.22222");
        }//try
    }
}
