package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = 0; i < t; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check() throws IOException {
        String s = br.readLine();
        boolean[] checked = new boolean[26];
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);


            if (n != num) {
                if (!checked[num - 'a']) {
                    checked[num - 'a'] = true;
                    n = num;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
