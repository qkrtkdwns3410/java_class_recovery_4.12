package com.company.ch14.bin;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 400),
                new Student("천자바", 1, 100),
                new Student("용자바", 3, 200),
                new Student("첸자바", 3, 300),
                new Student("진자바", 3, 300),
                new Student("김자반", 2, 200)
        );
        studentStream.sorted(Comparator.comparing(Student::getBan)  //반별 정렬
                .thenComparing(Comparator.naturalOrder()))          //기본 정렬
                .forEach(System.out::println);
        
        
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;
    
    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }
    
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
    
    String getName() {
        return name;
    }
    
    int getBan() {
        return ban;
    }
    
    int getTotalScore() {
        return totalScore;
    }
    
    //총점 내림차순을 기본 정렬로 한다.
    public  int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
