package com.soong.programmers.level1;

import sun.text.normalizer.UTF16;

public class 문자열내p와y의개수 {

    public static void main(String[] args) {
        System.out.println(solution("pPppoooyY Yyooo"));
        System.out.println(solution2("pPpoooY Yyooo"));
    }

    // solution1
    public static boolean  solution(String s) {
        String text[] = s.toLowerCase().trim().split("");

        int p = 0;
        int y = 0;

        for (String letter : text) {
            if (letter.equals("p")) p ++;
            if (letter.equals("y")) y ++;
        }
        return  p == y ? true : false;
    }

    // solution2
    public static boolean  solution2(String s) {
        s.toLowerCase();

        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'p') p++;
            if (s.charAt(i) == 'y') y++;
        }
        return  p == y ? true : false;
    }
}
