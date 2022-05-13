package PRO;

public class PRO87389 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = n;
        int min = 0;
        int num = 2;
        while (true) {
            if (num == n) {
                break;
            }
            if (n % num == 1) {
                min = num;
                answer = Math.min(answer, min);
            }
            num++;
        }
        return answer;
    }
}
