package PRO;

//kim 찾기
public class PRO12919 {
    public String solution(String[] seoul) {
        String name = "Kim";
        String answer = "";
        int num = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(name)) {
                num = i;
                break;
            }
        }
        answer = "김서방은 " + (num + "")+"에 있다";
        return answer;
    }
}
