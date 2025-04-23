package 백준.그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MVP다이아몬드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] mvp = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            mvp[i] = Integer.parseInt(st.nextToken());
        }

        char[] str = br.readLine().toCharArray();

        int[] money = new int[n + 1];
        money[0] = 0;

        int answer = money[0];

        for (int i = 0; i < n; i++) {
            switch (str[i]) {
                case 'B' :
                    money[i + 1] = mvp[0] - money[i] - 1;
                    break;
                case 'S' :
                    money[i + 1] = mvp[1] - money[i] - 1;
                    break;
                case 'G' :
                    money[i + 1] = mvp[2] - money[i] - 1;
                    break;
                case 'P' :
                    money[i + 1] = mvp[3] - money[i] - 1;
                    break;
                case 'D' :
                    money[i + 1] = mvp[3];
                    break;
            }

            answer += money[i + 1];
        }

        System.out.println(answer);
    }
}
