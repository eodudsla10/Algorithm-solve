package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int[] sum = new int[t];
        int result =0;
        for (int i = 0; i < t; i++) {
            sum[i] = Integer.parseInt(num.substring(i, i + 1));
        }


        for (int i = 0; i < sum.length; i++) {
            result += sum[i];

        }
        System.out.println(result);
    }
}
