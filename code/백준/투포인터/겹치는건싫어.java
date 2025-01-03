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
        int length = 0;
        int start = 0;
        int end = 0;
        int tmp = 0;
        int[] count = new int[100001];

        while(end < N) {
            System.out.println("start : " + start + " end : " + end);
            if (count[arr[end]] > K) {
                count[arr[start]]--;
                start++;
                length--;
            } else {
                count[arr[end]]++;
                end++;
                length++;
            }

            if (answer < length) {
                    answer = length;
            }

            System.out.println("length : " + length + " tmp : " + tmp);
        }
        
        return answer;
    }
}









