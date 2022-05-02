package PRO;

public class PRO12934 {
    public long solution(long n) {
        long num = (long) (n / Math.sqrt(n));
        long answer = 0;
        if (num == Math.sqrt(n)) {
            answer = (num+1)*(num+1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
