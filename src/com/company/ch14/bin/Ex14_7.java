package com.company.ch14.bin;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );
    
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
    
        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
        
        String[] lineArr = {}
    }
}