package com.soong.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    /*
    문제 설명)
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건)
    n은 10,000,000,000이하인 자연수입니다.

    입출력 예)
    n	    return
    12345	[5,4,3,2,1]
    */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        System.out.println(Arrays.toString(solution2(12345)));
    }

    // solution1
    public static int[] solution(long n) {
        char[] chars = new StringBuffer(String.valueOf(n)).reverse().toString().toCharArray();
        int[] result = new int[chars.length];

        for (int i = 0; i < chars.length; i++)
            result[i] = chars[i] - 48;

        return  result;
    }

    // solution2
    public static int[] solution2(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] answers = String.valueOf(n).split("");

        for (int i = answers.length - 1; i >= 0; i--)
            list.add(Integer.parseInt(answers[i]));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
