package com.company.Ex7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard cards[] = new SutdaCard[CARD_NUM];
    
    SutdaDeck() {
        //(1)배열 SutdaCard를 적절히 초기화 하시오
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            
            //cards[i]와 cards[j]의 값을 서로 바꾼다
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
            
        }
    }
    
    SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM) {
            return null; //index의 유효성 검사
        }
        return cards[index];
    }
    
    SutdaCard pick() { //매개변수 입력하지않으면 기본형 랜덤으로 숫자반환합니다.
        int j = (int) (Math.random() * cards.length);
        return cards[j];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;
    
    SutdaCard() {
        this(1, true);
    }
    
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    //info()대신 Object클래스의 toString()을 오버라이딩했다
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Prac07_01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
    
        System.out.println(deck.pick());
        System.out.println(deck.pick(0));
        deck.shuffle();
        
        
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.println(deck.cards[i]+",");
        }
    
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
