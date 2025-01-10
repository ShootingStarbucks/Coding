import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 봄버맨 {
    static int[][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        map = new int[c][r];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            char[] arr = st.nextToken().toCharArray();

            for (int j = 0; j < c; j++) {
                if (arr[j] == '.') {
                    map[j][i] = 0;
                } else if (arr[j] == 'O') {
                    map[j][i] = 2;
                }
            }
        }

        solution(r, c, n);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[j][i] == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public static void solution(int r, int c, int n) {
        for (int time = 1; time < n; time++) {
            if (time % 2 == 1) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (map[j][i] == 0) {
                            map[j][i] = 3;
                        } else if (map[j][i] == 2){
                            --map[j][i];
                        }
                    }
                }
            } else {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (map[j][i] == 3) {
                            --map[j][i];
                        } else if (map[j][i] == 1){
                            map[j][i] = 0;

                            for (int k = 0; k < 4; k++) {
                                int x = j + dx[k];
                                int y = i + dy[k];

                                if (x < 0 || x >= c || y < 0 || y >= r) {
                                    continue;
                                }

                                if (map[x][y] != 1) {
                                    map[x][y] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
