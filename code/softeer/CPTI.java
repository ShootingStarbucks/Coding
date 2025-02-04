import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CPTI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine(), 2);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (isCPTI(arr[i], arr[j])) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }

    public static boolean isCPTI(int a, int b) {
        return Integer.bitCount(a ^ b) <= 2;
    }
}
