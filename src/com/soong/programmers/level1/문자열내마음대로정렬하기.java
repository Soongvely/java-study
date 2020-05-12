package com.soong.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
    /*
    문제 설명)
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

    제한 조건)
    strings는 길이 1 이상, 50이하인 배열입니다.
    strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    모든 strings의 원소의 길이는 n보다 큽니다.
    인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    입출력 예)
    strings	n	return
    [sun, bed, car]	1	[car, bed, sun]
    [abce, abcd, cdx]	2	[abcd, abce, cdx]

    입출력 예 설명)
    입출력 예 1
    sun, bed, car의 1번째 인덱스 값은 각각 u, e, a 입니다. 이를 기준으로 strings를 정렬하면 [car, bed, sun] 입니다.

    입출력 예 2
    abce와 abcd, cdx의 2번째 인덱스 값은 c, c, x입니다. 따라서 정렬 후에는 cdx가 가장 뒤에 위치합니다.
    abce와 abcd는 사전순으로 정렬하면 abcd가 우선하므로, 답은 [abcd, abce, cdx] 입니다.
    */

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"sun", "bed", "car"}, 1));
        System.out.println(solution2(new String[]{"abce", "abcd", "cdx"}, 2));
    }

    // solution1
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) return 1;
            else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            else if (o1.charAt(n) < o2.charAt(n)) return -1;
            else return 0;
        });
        System.out.println("solution1" + Arrays.toString(strings));

        return strings;
    }

    // solution2
    public static String[] solution2(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        System.out.println("solution2" + Arrays.toString(answer));

        return answer;
    }
}