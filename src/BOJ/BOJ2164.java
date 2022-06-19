package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int a = 0;
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }
        while (true) {
            if (queue.size() == 1) {
                a = queue.poll();
                break;
            }
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(a);
    }
}
