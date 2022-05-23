package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                st.pop();
            } else {
                st.add(num);
            }
        }
        int answer =0;
        while (true) {
            if (st.isEmpty()) {
                break;
            }
            answer += st.pop();
        }
        System.out.println(answer);
    }
}
