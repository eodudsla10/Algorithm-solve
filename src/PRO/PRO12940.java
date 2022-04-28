package PRO;

public class PRO12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int t = gcd(n,m);
        int tt = (n * m) / gcd(n, m);
        answer[0] = t;
        answer[1] = tt;
        return answer;
    }

    static int gcd(int n, int m) {
        while (m != 0) {
            int r = n %m; // 나머지를 구해준다.

            //gcd(a,b) = gcd(b,r) 이므로 변환한다.
            n = m;
            m = r;
        }
        return n;
    }
}
