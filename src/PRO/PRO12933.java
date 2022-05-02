package PRO;

import java.util.Arrays;
public class PRO12933 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        String num ="";
        String s = String.valueOf(n);
        char[] chr = new char[s.length()];

        for (int i = 0; i < chr.length; i++) {
            chr[i] =s.charAt(i);
        }
        Arrays.sort(chr);
        for (int i = chr.length-1; i>=0; i--) {
            num += (chr[i]+"");

        }
        answer = Long.valueOf(num);
        return answer;
    }

}
