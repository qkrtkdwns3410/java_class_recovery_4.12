package com.company.Ex3;

public class Ex3_3 {
    public static void main(String[] args) {
//        int num =111;
//        System.out.println(Math.round(num/100)*100);
        
        //3-4 문제
//        int numOfApples =123; //사과의 개수
//        int sizeOfBucket =10; //바구니의 크기
//        int numOfBucket =(numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket :numOfApples/sizeOfBucket+1);
//
//        System.out.println("필요한 바구니 수 :"+numOfBucket);
        
        //3-5문제
//        int num = -3;
//        System.out.println(num>=0 ? (num==0 ? "0":"양수"):"음수");
        
        //3-6문제
        int fahrenheit =100;
        float celcius =  (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
    
        System.out.println("Fahrenheit:"+ fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
