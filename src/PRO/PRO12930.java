package PRO;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

//짝수는 대문자로
//홀수는 소문자로
//문자별로 짝/홀수 유무 파악
//"try hello world"
public class PRO12930 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx =0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx=0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }
}
