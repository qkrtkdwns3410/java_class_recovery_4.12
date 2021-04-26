package com.company.ch11.src;

import java.util.ArrayList;














public class GenericTest {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList(); //JDK1.5이전
        ArrayList<Object> list = new ArrayList<Object>(); //JDK 1.5이후
        list.add(10);   //list.add(new Integer(10));
        list.add(20);
//        list.add("30"); //String을 추가 //타입 체크가 강화되었습니다. 지네릭스 덕분에
        //지네릭스를 사용하는 이유>> 컴파일러상에서 오류를 찾아내기 위해서.
        //지네릭스를 사용하지 않는다면 ClassException오류가 발생할 가능성이 높습니다..
        
    
//        Integer i = (Integer) list.get(2);
        String i =  (String) list.get(2);       //형변환 생략이 가능합니다
        
        System.out.println(list);
        
    }
}
