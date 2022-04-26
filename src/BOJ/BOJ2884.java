package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken())*60;
        int b = Integer.parseInt(st.nextToken());
        int sum = a+b-45;
        int h = sum / 60;
        int m = sum % 60;

        if (0 == h && m < 0) {
            h = sum / 60 + 23;
        }

        if (m < 0) {
            m = sum % 60  +60;
        }
        sb.append(h).append(" ").append(m);
        System.out.println(sb);
    }
}
