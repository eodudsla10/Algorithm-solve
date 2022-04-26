package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int add = Integer.parseInt(st.nextToken());

        int m = b + add;
        int h = a;
        if (m >= 60) {
            m = (b + add) % 60;
            h += (b + add) / 60;
            if (h >= 24) {
                h -=24;
            }
        }
        sb.append(h).append(" ").append(m);
        System.out.println(sb);

    }
}
