package com.company.Ex4;

public class Main {

    public static void main(String[] args) {
        //산술 연산자 + - 등등
        //비교 연산자 > < ...
        //논리 연산자 && || ! .. !(x>3) == (x<=3)
        //대입 연산자 =
        //기타 (type) ?: instanceof 형변환 연산자, 삼항 연산자, instanceof연산자

        //3-3연산자의 우선순위
        //하나의 식에 연산자가 둘 이상 있을 떄 , 어떤 연산을 먼저 수행할 지를 자동 결정하는 것
        //곱 먼저 ..덧셈 뺼셈 순서대로..
        //연산자 결합규칙
        //x =y =3일경우  y=3 (1) x=y (2) 순서대로

        //연산자의 우선순위와 결합법칙은..
        //1.산술 > 비교 >논리>대입 대입은 제일 마지막에
        //2.단항(1) >이항(2) > 삼항(3) .단항 연산자의 우선순위가 이항 연산자보다 높다
        //3.단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다

        //3-5 증감 연산자
        //전위형   j = ++i; 값이 참조되기 전에 증가시킨다
        //후위형   j = i++; 값이 참조된 후에 증가한다.
        //증감 연산자가 독립적으로 사용된 경우, 전위 후위의 차이가 없습니다.
//        int i=5, j=0;
//
//        j=i; //후위형
//        i++;
//        System.out.println("j=i++; 실행후 ,i="+i+",j="+j);
//
//        i=5;
//        j=0;
//        //3-7 형변환 연산자안녕하세요
        //형변환 >>> 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
        //(타입)피연산자
        
//        double d =85.4;
//        int score =(int)d; //더블 8바이트 .. int 4바이트 .. 형이 달라서 사용하기가 힘듭니다. 그래서 int로 변경합니다
        
        //same as
        //int score = (int)85.4; 소수점이 떨어집니다.
        // int score =85; 저장
        //변환 int >>char
        //(char)65 ='A'
        //(int)'A' =65
        
        //실수<>정수
        //(int)1.6f >> 1 //반올림 x그냥 버림
        //(float)10 >> 10.0f
        
        //3-8 자동 형변환
//        float f =1234; //int타입의 값을 float타입의 변수에 저장
        //int값의 범위보다 float의 범위가 더 넓습니다
        //same as upper
        //float f = (float)1234;
        // float생략해도 컴파일러가 알아서 넣어줌
        
        //int i =3.14f; //에러발생 int i 보다 f범위가 더 넓습니다. 그래서 오류가 발생합니다
        
//        int i1 =(int)3.14f; //OK 수동 형변환
        //자동 형변환
        //서로다른 두 타입을 일치시키기 위해서 , 형변환을 생략하면 컴파일러가 알아서 자동적으로 형변환을 한다.
        //byte <short,char<int < long < float < double
        //1         2        4       8       4       8
        
//        byte b= 100; //OK
        //byte b =(byte)100과 같은거임
        //int i =100;
        //byte b =i;
        
        //3-10 산술변환
        
        //연산 전에 피연산자의 타입을 일치시키는 것
        //1)두 피연산자의 타입을 같게 일치시킨다 (보다 큰 타입으로 일치)
        //long + int= long float+int =float ...
        
        //2)피연산자의 타입이 int보다 작은 타입이면 int로 변환된다
        //byte + short =int
        //char + short =int
        //byte -128 ~127 char 0~6만 short +-3만
        // 범위가 너무 좁음.>>오버플로우 발생하기에 방지차원?
        
//        char a ='2',b='0';
//        System.out.println(a-b); //int 2가 출력됩니다.
        
        //'2' ==코드 50
        //'0' ==유니코드 48
        //그래서 뺴면 유니코드 2 ==숫자 2
        
        
        

    }
}









