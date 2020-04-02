package com.soong.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치하기 {
    /*
    문제 설명)
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    제한 사항)
    str은 길이 1 이상인 문자열입니다.

    입출력 예)
    str	        return
    Zbcdefg	    gfedcbZ
     */

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
        System.out.println(solution2("aZbcdefg"));
    }

    // solution1
    public static String solution(String str) {

        String[] array = str.split("");

        return Arrays.stream(array).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    // solution2
    public static String solution2(String str) {

       String[] array = str.split("");
       Arrays.sort(array, Collections.reverseOrder());

       return String.join("", array);
    }

}
