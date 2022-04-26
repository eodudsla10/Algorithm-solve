package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append((a + b)).append("\n");
        }
        System.out.println(sb);

    }
}
