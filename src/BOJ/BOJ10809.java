package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int[26];
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (a[ch - 'a'] == -1) {
                a[ch - 'a'] = i;
            }

        }

        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
