package com.soong.programmers.level1;

public class 문자열다루기기본 {

    /*
    문제 설명)
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

    제한 사항)
    s는 길이 1 이상, 길이 8 이하인 문자열입니다.

    입출력 예)
    s	return
    a234	false
    1234	true
    */

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution2("a234"));
        System.out.println(solution3("1234"));
        System.out.println(solution4("a234"));
    }

    // solution1
    public static boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && (s.split("[0-9]").length <= 0);
    }

    // solution2
    public static boolean solution2(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }
        return answer;
    }

    // solution3
    public static boolean solution3(String s) {
        try {
            if(s.length() == 4 || s.length() == 6) {
                Integer.parseInt(s);
            } else return false;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    // solution4
    public static boolean solution4(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                answer = true;
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
