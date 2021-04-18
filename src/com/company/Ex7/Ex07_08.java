package com.company.Ex7;


class Product {
    int price;          //제품의 가격
    int bounusPoint;    //제품 구매시 제공하는 보너스 점수
    
    Product(int price) {
        this.price = price;
        bounusPoint = (int) (price / 10.0); //보너스 점수는 제품가격의 10%
    }
    
    Product() {}//기본 생성자
}

class Tv1 extends Product {
    
    Tv1() {
        //조상 클래스의 생성자 Product(int Price)를 호출한다
        super(100); //Tv의 가격을 100만원으로 한다.
    }
    //Object클래스의 toString()을 오버라이딩한다
    public String toString(){
        return "Tv";}
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    
    public String toString() {
        return "Computer";
    }
    
}

class Buyer { //고객 , 물건을 사는 사람
    int money = 1000;
    int bounusPoint = 0;
    Product[] cart = new Product[10]; //구입한 상품을 저장하기 위한 배열
    int i = 0; //Product배열에 사용될 카운터
    
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            return;
        }
        money -= p.price;
        bounusPoint += p.bounusPoint;
        cart[i++] = p; //제품을 Product[]cart에 담는다.
        System.out.println(p + "을/를 구입하셨습니다");
    }
    
    void Summary() {
        int sum = 0; //구입한 물품의 가격합계
        String itemList = ""; //구입한 물품목록
        
        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += (i==0)?""+cart[i]:", "+cart[i];
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
        
    }
}
public class Ex07_08 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
    
        b.buy(new Tv1());
        b.buy(new Computer());
        
        b.Summary();
    }
}
