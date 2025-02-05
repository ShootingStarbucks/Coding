package 백준.그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 숫자더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int command = Integer.parseInt(st.nextToken());

        while (command != 0) {
            List<Integer> list = new ArrayList<>();
            int zero = 0;

            for (int i = 0; i < command; i++) {
                int tmp = Integer.parseInt(st.nextToken());

                if (tmp == 0) {
                    zero++;
                }

                list.add(tmp);
            }

            list.sort((o1, o2) -> o1 - o2);

            String a = "";
            String b = "";

            for (int i = 0; i < zero; i++) {
                if (i % 2 == 0) {
                    a += list.get(i);
                } else {
                    b += list.get(i);
                }
            }

            a = list.get(zero) + a;
            b = list.get(zero + 1) + b;

            for (int i = zero + 2; i < list.size(); i++) {
                if (a.length() == b.length()) {
                    if (Integer.parseInt(a) == 0 && list.get(i) != 0) {
                        a = list.get(i) + a;
                    } else {
                        a = a + list.get(i);
                    }
                } else {
                    if (Integer.parseInt(b) == 0 && list.get(i) != 0) {
                        b = list.get(i) + b;
                    } else {
                        b = b + list.get(i);
                    }
                }
            }

            System.out.println(Integer.parseInt(a) +  Integer.parseInt(b));
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());
        }
    }
}
