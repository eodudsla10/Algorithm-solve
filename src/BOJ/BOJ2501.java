package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = (int) Math.sqrt(a);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (a % i == 0) {
                //작은 수
                list.add(i);
                if (a / i != i) {
                    //큰 수
                    list.add(a / i);
                }
            }
        }
        Collections.sort(list);
        if (list.size() < b) {
            System.out.println(0);
        } else {
            System.out.println(list.get(b-1));
        }
    }

}
