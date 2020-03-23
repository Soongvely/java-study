package com.soong.programmers.level1;

public class 문자열을정수로바꾸기 {

    public static void main(String[] args) {
         System.out.println(solution("-12345"));
         System.out.println(solution2("-1234"));
    }

    /*
    문제 설명)
    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    제한 조건)
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 0으로 시작하지 않습니다.

    입출력 예)
    str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
    str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
     */

    // solution
    public static int solution(String str) {

        return Integer.parseInt(str);
    }

    // solution2
    public static int solution2(String str) {

        boolean plus = true;
        int value = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                plus = false;

            } else {
                int num = ch - 48;          // ch가 '1'인 경우 : int num = '1' - 48, num = 1  -->  // ch가 '2'인 경우 : int num = '2' - 48, num = 2
                value = num + value * 10;   // value = 1 + 0 * 10, value = 1                  -->  // value = 2 + 1 * 10, value = 12  ㆍㆍㆍ value = 1234
            }
        }

        return (plus == true) ? value : -1 * value;  // plus가 양수면 1234, 음수면 -1234
    }
}
