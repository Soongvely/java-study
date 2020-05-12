package com.soong.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 정수내림차순으로배치하기 {

    /*
    문제 설명)
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건)
    n은 1이상 8000000000 이하인 자연수입니다.

    입출력 예)
    n	    return
    118372	873211
    */

    public static void main(String[] args) {
        System.out.println(solution(118372));
        System.out.println(solution2(118372));
        System.out.println(solution3(118372));
    }

    // solution1
    public static long solution(long n) {

        return Long.parseLong(String.valueOf(n)
                .chars()
                .mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }

    // solution2
    public static long solution2(long n) {
        String result = "";
        char[] chars = String.valueOf(n).toCharArray();

        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--)
            result += chars[i];

        return Long.parseLong(result);
    }

    // solution3
    public static long solution3(long n) {
        String result = "";
        String[] textNum = String.valueOf(n).split("");

        Arrays.sort(textNum, (o1, o2) -> {
           if (o1.charAt(0) < o2.charAt(0)) return 1;
           else if (o1.charAt(0) == o2.charAt(0)) return o1.compareTo(o2);
           else if (o1.charAt(0) > o2.charAt(0)) return -1;
           else return 0;
        });

        for (String tn : textNum) result += tn;

        return Long.parseLong(result);
    }
}
