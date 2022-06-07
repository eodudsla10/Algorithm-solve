package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int add = 0;
        int[] num = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            int plus =0;
            for (int j = i; j >=0; j--) {
                plus += num[j];
            }
            add += plus;
        }
        System.out.println(add);

    }
}
