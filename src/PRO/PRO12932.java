package PRO;

import java.util.Arrays;

public class PRO12932 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        String[] str = sb.toString().split("");

        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}

