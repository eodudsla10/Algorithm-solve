package PRO;

import java.util.Arrays;

public class PRO12917 {
    public static String solution(String s) {
        char[] sol = s.toCharArray();

        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

}

//기존 풀이
//    public static String solution(String s) {
//        String answer = "";
//        String[] str = new String[s.length()];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = s.charAt(i) + "";
//        }
//        Arrays.sort(str);
//
//        for (int i = str.length-1; i>=0; i--) {
//            answer += str[i];
//        }
//        return answer;
//    }
