package com.company.Ex7;

import java.util.Scanner;

public class eee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = mystery(sc.nextInt());
        System.out.println("n="+n);
    }
    
    public static int mystery(int n) {
        if (n > 5) {
            return mystery(n - 2) + 2;
        }
        return n + 2;
    }
}

