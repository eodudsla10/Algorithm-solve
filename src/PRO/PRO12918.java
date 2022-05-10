package PRO;

public class PRO12918 {
    public boolean solution(String s) {
        boolean answer = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 || s.charAt(i) <=122 && s.length() !=4 && s.length() !=6 ) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
