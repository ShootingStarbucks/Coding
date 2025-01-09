package 백준.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class 수이어쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int answer = 1;
        int[] arr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int a : arr) {
            if (queue.isEmpty()) {
                answer ++;
                int[] n = Stream.of(String.valueOf(answer).split("")).mapToInt(Integer::parseInt).toArray();

                for (int b : n) {
                    queue.add(b);
                }
            }

            int now = queue.poll();

            while (now != a) {
                if (queue.isEmpty()) {
                    answer ++;
                    int[] n = Stream.of(String.valueOf(answer).split("")).mapToInt(Integer::parseInt).toArray();

                    for (int b : n) {
                        queue.add(b);
                    }
                } else {
                    now = queue.poll();
                }
            }
        }

        return answer;
    }
}
