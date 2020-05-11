package com.soong.programmers.level1;

import java.util.Arrays;

public class 소수찾기 {
    /*
    문제 설명)
    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

    소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
    (1은 소수가 아닙니다.)

    제한 조건)
    n은 2이상 1000000이하의 자연수입니다.
    입출력 예)
    n	result
    10	4
    5	3

    입출력 예 설명)
    입출력 예 #1
    1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

    입출력 예 #2
    1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
    */

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution2(10));
    }

    // solution1 ---> 효율성 낮음
    public static int solution(int n) {
        int result = 0;

        if (n <= 1) return 0;

        for (int i = 2; i <= n; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) result++;
        }
        return result;
    }

    // solution2
    public static int solution2(int n) {
        int answer = 0;

        int[] number = new int[n+1];

        // 2부터 n까지의 수를 배열에 담기
        for(int i = 2; i <= n; i++) {
            number[i] = i;
        }

        // 2부터 시작해서 그의 배수들을 0으로 set
        // 후에 배열의 i번째 값이 0이면 pass, 아니면 그의 배수들을 다시 0으로 set
        for(int i = 2; i <= n; i++) {
            System.out.println(Arrays.toString(number) + (i-1) + "번째");

            if(number[i] == 0) continue;

            for(int j = 2 * i; j <= n; j += i) {
                number[j] = 0;
            }
        }

        // 배열에서 0이 아닌 값들의 개수를 리턴
        for(int i = 0; i < number.length; i++) {
            if(number[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
