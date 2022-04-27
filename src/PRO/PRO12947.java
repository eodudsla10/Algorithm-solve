package PRO;

public class PRO12947 {
    public static void main(String[] args) {
        int x =10;
        System.out.println(solution(10));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        String s = x + "";
        int num =0;
        for (int i = 0; i < s.length(); i++) {
            num += Integer.parseInt(s.substring(i, i + 1));
        }
        if (x % num != 0) {
            answer = false;
        }
        return answer;
    }
}
