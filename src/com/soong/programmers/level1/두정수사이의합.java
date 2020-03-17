package com.soong.programmers.level1;

import java.util.stream.Collector;
import java.util.stream.LongStream;

public class 두정수사이의합 {
    /*
    문제 설명
    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

    제한 조건
    a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
    a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
    a와 b의 대소관계는 정해져있지 않습니다.

    입출력 예)
    a	b	return
    3	5	12
    3	3	3
    5	3	12
    */

    public static void main(String[] args) {
        long result = solution2(5, 3);
        System.out.println(result);

        solution3(1,10);
    }

    // solution1
    public static long solution(int a, int b) {
        long answer = 0;

        if (a < b)
            for (int i = a; i <= b; i++)  answer += i;
        else
            for (int i = b; i <= a; i++) answer += i;

        return answer;
    }

    // solution2
    public static long solution2(int a, int b) {

        int max = a > b ? a : b;
        int min = a > b ? b : a;

        long answer = 0;

        for (int i = min; i <= max; i++) answer += i;

        return answer;
    }

    // solution3
    public static long solution3(int a, int b) {
        // Stream : 컬렉션, 배열등의 저장 요소를 하나씩 참조하며 함수형 인터페이스(람다식)를 적용하며 반복적으로 처리할 수 있도록 해주는 기능
        return LongStream.range(a > b ? b : a, (a > b ? a : b) + 1).sum();
    }
}