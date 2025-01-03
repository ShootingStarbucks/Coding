import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class 겹치는건싫어 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for (int j = 0; j < N; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, K, arr));
        
    }

    public static int solution(int N, int K, int[] arr) {
        int answer = 0;
        int start = 0;
        int end = 0;
        int[] count = new int[100001];
        count[arr[0]]++;

        while(end < N - 1) {
            if (count[arr[end]] > K) {
                count[arr[start]]--;
                start++;
            } else {
                end++;
                count[arr[end]]++;
            }

            if (count[arr[end]] > K) {
                continue;
            } else if (answer < end - start) {
                answer = end - start;
            }
        }

        return answer + 1;
    }
}
