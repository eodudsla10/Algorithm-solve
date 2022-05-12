package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PRO4963 {
    static int w,h, cnt;
    static int[][] map;
    static boolean[][] flag;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            flag = new boolean[h][w];
            cnt = 0;
            if (w == 0 && h == 0) {
                break;
            }
            //입력
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !flag[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void bfs(int i, int j) {
        Queue<find> q = new LinkedList<>();
        q.add(new find(i, j));
        flag[i][j] = true;

        while (!q.isEmpty()) {
            find p = q.poll();

            for (int k = 0; k < 8; k++) {
                int nx = p.i + dx[k];
                int ny = p.j + dy[k];

                if (nx >= h || ny >= w || nx < 0 || ny < 0) {
                    continue;
                }

                if (map[nx][ny] == 1 && !flag[nx][ny]) {
                    q.add(new find(nx, ny));
                    flag[nx][ny] = true;
                }
            }
        }
    }

    private static class find {
        int i, j;

        public find(int i, int j) {
            this.i = i;
            this.j = j;
        }

    }
}
