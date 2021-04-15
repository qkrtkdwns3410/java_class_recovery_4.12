package com.company.Ex5;

public class Ex05_05 {
    public static void main(String[] args) {
        int ball[] = new int[45];
        
        //배열의 각 요소에 1~45의 값을 저장한다.
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int tmp = 0;
        int j = 0;
        
        //배열의 i번쨰 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        //0번쨰 부터 5번째 요소까지 모두 6개만 바꾼다.
    
        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] is %d\n", i, ball[i]);
        }
    }
}
