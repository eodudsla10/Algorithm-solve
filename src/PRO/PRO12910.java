package PRO;

import java.util.ArrayList;
import java.util.Collections;

//divisor로 나누어 떨어져야한다
//오름차순
//없으면 -1 반환
public class PRO12910 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() ==0) {
            list.add(-1);
        }
        Collections.sort(list);
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
