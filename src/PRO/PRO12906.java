package PRO;
import java.util.*;
public class PRO12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int []arr) {
        int[] answer;
        Deque<Integer> q = new LinkedList<>();
        q.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (q.peekLast() != arr[i]) {
                q.add(arr[i]);
            }
        }
        answer = new int[q.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}
