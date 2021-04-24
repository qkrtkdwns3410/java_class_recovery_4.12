package com.company.Ex9;

import java.util.ArrayList;
import java.util.Arrays;

public class RoundTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); //list에는 객체만 추가가능합니다.
        list.add(100); //JDK1.5이전에는 에러였습니다. //오토박싱입니다.
    
//        Integer i = list.get(0); //list에 저장된 첫번째 객체를 꺼낸다
//        int i = list.get(0).intValue(); //listValue()로 Integer를 int로 변환
        //Integer를 어떻게 int에 담음 ㅋㅋㅋ
        //intValue호출해서 Integer로 변환해 줘야합니다.
        //근데..?
        int i = list.get(0); //이 가능함 컴파일러가 Integer를 자동으로 int로 변환해준다.
        //언박싱(unBoxing)
        
        
    }
}
