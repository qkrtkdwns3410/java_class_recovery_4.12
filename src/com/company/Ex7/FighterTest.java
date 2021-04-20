package com.company.Ex7;

abstract class Unit {
    int x , y;
    
    abstract void move(int x, int y);
    
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {         //인터페이스의 모든 메서드는 public abstract입니다.
    void move(int x, int y); // public abstract가 생략됨
    
    void attack(Fightable f); // public abstract가 생략됨
    
}

class Fighter extends Unit implements Fightable {
    //오버라이딩 규칙: 조상(pbulic)보다 접근제어자가 좁으면 안된다. 그래서 public를 붙여줘야함
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }
    
    public void attack(Fightable f) {
        System.out.println(f+"를 공격합니다.");
    }
    
    Fightable getFighterable() {
        Fighter f = new Fighter(); //Figheter를 생성해서 반환
        return f;
    }
    
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 100);
        f.attack(new Fighter());
    }
}
