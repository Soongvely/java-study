package com.soong.programmers.level1;

public class 가운데글자가져오기 {

    /*
    문제 설명)
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항)
    s는 길이가 1 이상, 100이하인 스트링입니다.

    입출력 예)
    s	return
    abcde	c
    qwer	we
     */

    public static void main(String[] args) {
        System.out.println(solution("Helswi"));
        System.out.println(solution2("abcde"));
    }

    public static String solution(String s) {
        int even = (int)Math.ceil(s.length() / 2);
        int odd =  s.length() / 2 - 1;

        return s.length() % 2 == 1 ? s.substring(even, even + 1) : s.substring(odd, odd + 2);
    }


    public static String solution2(String s) {

        return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}
