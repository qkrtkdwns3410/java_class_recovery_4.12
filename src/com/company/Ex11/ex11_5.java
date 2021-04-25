package com.company.Ex11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ex11_5 {
    public static void main(String[] args) {
        Collection c = new ArrayList(); //Collection으로 설정하면 어레이리스트던 트리셋이던 해쉬 셋이던  전부 참조변수 안바꾸고 설정이 가능합니다.
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        
        Iterator it = c.iterator();
    
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
        //iterator는 1회용이라 다쓰고나면 다시 얻어와야 한다.
        it = c.iterator(); //새로운 iterator객체를 얻는다.
    
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
        
    }
}


















