package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < t; j++) {
                pqueue.add(Integer.parseInt(st.nextToken()));
            }
        }

        //수 꺼내기
        for (int i = 0; i < t-1; i++) {
            pqueue.poll();

        }
        System.out.println(pqueue.poll());
    }
}