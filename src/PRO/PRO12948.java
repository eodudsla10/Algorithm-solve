package PRO;

public class PRO12948 {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length()-4; i++) {
            char c = phone_number.charAt(i);
            c = '*';
            answer += Character.toString(c);
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}
