import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class 주식 {
    public static void main(String[] args) throws IOException{

        long sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            
            for (int j = 0; j < n; j++) {
                arr[j] = Long.parseLong(st.nextToken());
            }

            System.out.println(solution(n, arr));
        }
        
    }

    public static long solution(int n, long[] arr) {
        long answer = 0;
        long max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                answer += max - arr[i];
            }
            
            // System.out.println("sum : " + sum + " count : " + count + " answer : " + answer);
        }

        return answer;
    }
}









