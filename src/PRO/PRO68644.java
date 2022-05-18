package PRO;

import java.util.ArrayList;
import java.util.Collections;

//[2,1,3,4,1]
public class PRO68644 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if(!list.contains(num))
                    list.add(num);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);

        }
        return answer;
    }
}
