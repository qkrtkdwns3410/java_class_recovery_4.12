package com.company.ch14.bin;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };
    
        Stream<File> fileStream = Stream.of(fileArr);
        
        //map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);//모든 파일의 이름을 출력합니다.
    
        fileStream = Stream.of(fileArr); //스트림을 다시 생성
        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)//확장자가 없는 것은 제외합니다.
                .map(s -> s.substring(s.indexOf('.') + 1))//확장자만 추출합니다.
                .map(String::toUpperCase)//모두 대문자로 변환합니다.
                .distinct()                //중복을 제거합니다.
                .forEach(System.out::print);
    }
}
