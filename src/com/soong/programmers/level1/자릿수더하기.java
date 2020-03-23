package com.soong.programmers.level1;

public class 자릿수더하기 {

    public static void main(String[] args) {
        System.out.println(solution(146));
        System.out.println(solution2(146));
    }

    // solution1
    public static int solution(int n) {
        int answer = 0;

        String[] text = String.valueOf(n).split("");

        for (String ch : text) {
            answer += Integer.parseInt(ch);
        }

        return answer;
    }

    // solution2
    public static int solution2(int n) {
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
