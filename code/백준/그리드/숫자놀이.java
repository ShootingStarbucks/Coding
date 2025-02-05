package 백준.그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int T = 0;

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2};

        while (T != n) {
            int answer = 0;

            int x = Integer.parseInt(br.readLine());

            if (x == 1) {
                System.out.println(x);
                T++;
                continue;
            }

            while (x > 1) {
                int tmp = x;

                for (int i = 0; i < arr.length; i++) {
                    if (x % arr[i] == 0) {
                        answer++;
                        x /= arr[i];
                        break;
                    }
                }

                if (tmp == x) {
                    answer = -1;
                    break;
                }
            }

            System.out.println(answer);
            T++;
        }
    }
}
