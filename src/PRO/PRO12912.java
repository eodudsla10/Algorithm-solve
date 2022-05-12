package PRO;
//3 5
public class PRO12912 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min);
        System.out.println(max);

        if (min == max) {
            answer = min;
        } else {
            while (true) {
                if (min > max) {
                    break;
                }
                answer += min;
                min++;
            }
        }
        return answer;
    }
}
