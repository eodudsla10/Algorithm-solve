package PRO;

public class PRO12922 {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += "수";
            } else if (i % 2 == 0) {
                answer += "박";
            }
        }
        return answer;
    }
}