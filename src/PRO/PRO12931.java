package PRO;

//123 = 1+2+3 = 6
public class PRO12931 {
    public int solution(int n) {
        int answer = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            answer += n%10;
            n = n/10;
        }

        return answer;
    }
}
