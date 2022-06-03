package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int max1 =0;
        int max2 =0;

        max2 += (a * x) + (b * y);
        if (x < y) {
            max1 += (c * x * 2);
            y -= x;

            max1 = Math.min(max1 + (b * y), max1 + (c * y*2));
        } else if(x > y) {
            max1 += (c * y * 2);
            x -= y;

            max1 = Math.min(max1 + (a * x), max1 + (c * x*2));
        }

        System.out.println(Math.min(max1,max2));
    }
}
