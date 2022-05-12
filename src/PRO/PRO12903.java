package PRO;

//짝수라면 가운데 두글자 반환
public class PRO12903 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = (s.charAt(s.length() / 2 - 1) + "") + (s.charAt(s.length() / 2) + "");
        } else {
            answer += s.charAt(s.length()/2)+"";
        }
        return answer;
    }
}
