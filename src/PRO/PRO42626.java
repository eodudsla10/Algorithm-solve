package PRO;

import java.util.PriorityQueue;

public class PRO42626 {
    static PriorityQueue<Integer> pqueue = new PriorityQueue<>();
    public static void main(String[] args) {
        int[] scoville = {1,2};
        int k = 7;
        System.out.println(solution(scoville, k));
    }
    public static int solution(int[] scoville, int K) {

        int answer = 0;
        int cal =0;
        for (int i = 0; i < scoville.length; i++) {
            pqueue.add(scoville[i]);
        }
        while (!isal(cal,K)) {
            if (pqueue.size() == 1) {
                answer = -1;
                break;
            }
            int a = pqueue.poll();
            int b = pqueue.poll();
            pqueue.add(a + b * 2);
            answer++;
        }

        return answer;
    }

    private static boolean isal(int cal, int k) {
        cal = (int)pqueue.peek();
        if (cal >= k) {
            return true;
        } else {
            return false;
        }
    }
}
