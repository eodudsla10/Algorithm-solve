package PRO;

import java.util.Arrays;

public class PRO12982 {
    public static void main(String[] args) {
        int[] d = {1,1,1};
        int budget = 2;
        System.out.println(solution(d, budget));
    }
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
