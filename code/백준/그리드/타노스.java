package 백준.그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class 타노스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        int[] arr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();

        int count0 = 0;
        int count1 = 0;

        for (int a : arr) {
            if (a == 0) {
                count0++;
            } else if (a == 1) {
                count1++;
            }
        }

        count0 /= 2;
        count1 /= 2;

        for (int a : arr) {
            if (a == 1) {
                if (count1 > 0) {
                    count1--;
                } else {
                    answer = answer + a;
                }
            } else {
                if (count0 > 0) {
                    answer = answer + a;
                    count0--;
                }
            }
        }

        return answer;
    }
}
