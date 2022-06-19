package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//경우의 수를 구해야한다.
public class BOJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < num; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a1 = st.nextToken();
                String a2 = st.nextToken();

                //getOrDefault : key 값이 존재한다면 해당 value를 반환하고, 없다면 설정한 defaultValue를 반환
                // ex) 처음 headngear 값이 없기 때문에 0을 반환하지만 +1를해서 headgear=1이 되고
                //      다음 headgear값이 있을 때 value값인 1을 반환하지만 +1를 해서 headgear=2가 된다.
                map.put(a2, map.getOrDefault(a2, 0) + 1);
            }
            int answer = 1;
            for (int val : map.values()) {
                //옷을 안 입을 경우가 있기 때문에 1를 더해야 한다.
                answer *= val +1;
            }
            //옷을 하나도 안 입을 경우가 있기 때문에 -1을 한다.
            System.out.println(answer -1);

        }

    }
}
