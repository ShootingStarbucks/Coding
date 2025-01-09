import java.util.*;
import java.lang.*;
import java.io.*;

public class 수열의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int a : solution(n, l)) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int n, int l) {
        int[] answer = null;

        for (int i = l; i <= 100; i++) {
            int x = n - ((i * i - i) / 2);

            if (x < 0) {
                break;
            }

            if (x % i == 0) {
                int a = x / i;

                answer = new int[i];

                for (int j = 0; j < i; j++) {
                    answer[j] = a + j;
                }

                break;
            }
        }

        if (answer == null) {
            answer = new int[]{-1};
        }

        return answer;
    }
}
