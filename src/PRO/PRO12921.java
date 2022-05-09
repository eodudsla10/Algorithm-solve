package PRO;

public class PRO12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] flag = new boolean[n + 1];

        //2~n째 수를 true로 초기화
        for (int i = 2; i <=n; i++) {
            flag[i] = true;
        }

        //제곱근 구하기
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <=root; i++) {
            if (flag[i] == true) {
                for (int j = i; i*j<=n; j++) {
                    flag[i * j] = false;
                }
            }

        }
        for (int i = 2; i <=n; i++) {
            if (flag[i] == true) {
                answer++;
            }
        }
        return answer;
    }
}
