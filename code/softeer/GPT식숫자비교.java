import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class GPT식숫자비교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(Stream.of(br.readLine().split("\\.")).mapToInt(Integer::parseInt).toArray());
        }

        list.sort((s1, s2) -> {
            if (s1.length == 1 || s2.length == 1) {
                if (s1[0] != s2[0]) {
                    return s1[0] - s2[0];
                } else {
                    return s1.length - s2.length;
                }
            }

            if (s1[0] != s2[0]) {
                return s1[0] - s2[0];
            } else {
                return s1[1] - s2[1];
            }
        });

        for (int[] num : list) {
            String str = "";

            if (num.length == 1) {
                str += num[0];
            } else {
                str += num[0] + "." + num[1];
            }

            System.out.println(str);
        }
    }
}
