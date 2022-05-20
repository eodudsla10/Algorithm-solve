package PRO;

public class PRO68935 {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        String s = "";
        int answer = 0;
        int count =0;
        while (true) {
            if (n == 0) {
                break;
            }
            s += ((n % 3)+"");
            n /= 3;
        }
        System.out.println(s);
        for (int i = s.length()-1; i >=0; i--) {
            answer +=   (s.charAt(i)-'0')*Math.pow(3,count);
            count++;
        }

        return answer;
    }
}
