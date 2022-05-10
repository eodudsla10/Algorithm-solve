package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = br.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //단어 길이가 같은 경우
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        sb.append(str[0]).append("\n");
        for (int i = 1; i < str.length; i++) {
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append("\n");
            }

        }
        System.out.println(sb);
    }
}