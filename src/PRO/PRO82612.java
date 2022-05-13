package PRO;

public class PRO82612 {
    public long solution(int price, int money, int count) {
        long answer = price;
        int sum = price;
        for (int i = 2; i <= count; i++) {
            sum = price * i;
            answer += sum;
        }
        if (answer - money <= 0) {
            return 0;
        } else {
            Math.abs(answer = answer - money);
        }

        return answer;
    }
}
