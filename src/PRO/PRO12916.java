package PRO;

import java.util.Locale;

public class PRO12916 {
    boolean solution(String s) {
        boolean answer = true;
        String ss = s.toUpperCase();
        int a = 0;
        int b = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == 'P') {
                a++;
            } else if (ss.charAt(i) == 'Y') {
                b++;
            }
        }
        if (a != b) {
            answer = false;
        }

        return answer;
    }
}
