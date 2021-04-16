package com.company.Ex6;

class Ex06_14 {
    static {
        System.out.println("static{ }");
        
    }//클래스 초기화 블럭
    
    {
        System.out.println("{ }");
    }//인스턴스 초기화 블럭
    
    public Ex06_14(){
        System.out.println("생성자");
    }
    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex06_14 bt = new Ex06_14();
    
        System.out.println("Ex6_14 bt = new Ex6_14()");
        Ex06_14 bt2 = new Ex06_14();
    }
}
