package PRO;

import java.util.ArrayList;
import java.util.Arrays;
public class PRO12935 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1) {
            answer = new int[]{-1};
        }
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int num = temp[0]; //최솟값

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                continue;
            } else {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
