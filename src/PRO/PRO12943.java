package PRO;

//int -> 오버플로우 발생
public class PRO12943 {
    public int solution(int num) {
        int answer = 0;
        long aa = num;
        while (true) {
            if(aa == 1)
                break;

            if(answer > 500) {
                answer = -1;
                break;
            }

            if ((aa % 2) == 0) {
                aa = aa / 2;
                answer++;
            } else if ((aa % 2) != 0) {
                aa = ((aa*3) + 1);
                answer++;
            }
        }
        return answer;
    }
}
