package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
                arr[s.charAt(i) - 'A']++;
            else
                arr[s.charAt(i) - 'a']++;
        }
        char tt = '?';
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = Math.max(max, arr[i]);

                //숫자를 알파벳 대문자로 바꾸는 방법
                tt = (char) (i+65);
            }
            else if (max == arr[i]) {
                tt = '?';
            }
        }
        System.out.println(tt);
    }
}
