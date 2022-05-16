package PRO;
//a 는 월
//b는 일
public class PRO12901 {
    public String solution(int a, int b) {
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int total =0;
        //월마다 일수 더하기
        for (int i = 1; i < a; i++) {
            total += day[i-1];
        }
        total += b-1;
        return days[(total+5)  % 7];
    }
}
