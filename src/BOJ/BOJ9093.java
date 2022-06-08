package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];
        String s = "";
        for (int i = 0; i < t; i++) {
            str[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] temp = str[i].split(" ");
            for (int j = 0; j < temp.length; j++) {
                s = new StringBuilder(temp[j]).reverse().toString();
                sb.append(s).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}