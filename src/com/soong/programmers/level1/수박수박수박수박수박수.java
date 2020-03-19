package com.soong.programmers.level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수박수박수박수 {
    /*
    문제 설명
    길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

    제한 조건
    n은 길이 10,000이하인 자연수입니다.
    입출력 예
    n	return
    3	수박수
    4	수박수박
     */

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution2(5));
        System.out.println(solution3(6));
    }

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) answer += "수";
            else answer += "박";
        }
        return answer;
    }

    public static String solution2(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i % 2 == 1 ? "수" : "박";
        }
        return answer;
    }

    public static String solution3(int n) {

        return IntStream.range(0, n) // 0 ~ n 까지 들어있는 int타입 Stream 생성
                .mapToObj(i -> i % 2 == 0 ? "수" : "박") // 0 ~ n을 순환하면서 조건에 해당하는 문자
                .collect(Collectors.joining());  // 문자 Stream을 하나의 문자열로 합쳐준다.
    }

}
