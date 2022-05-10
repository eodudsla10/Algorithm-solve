package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
    }
}

//HashMap으로 풀이
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int t = Integer.parseInt(br.readLine());
//    ArrayList<HashMap<String, Object>> list = new ArrayList<>();
//        for (int i = 0; i < t; i++) {
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("age", Integer.parseInt(st.nextToken()));
//        map.put("name", st.nextToken());
//        list.add(map);
//        }
//        Collections.sort(list, new Comparator<HashMap<String, Object>>() {
//@Override
//public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
//        Integer age1 = (Integer) o1.get("age");
//        Integer age2 = (Integer) o2.get("age");
//        return age1.compareTo(age2);    //나이를 기준으로 오름차순 정렬
//        }
//        });
//
//        for (int i = 0; i < list.size(); i++) {
//        System.out.println(list.get(i).get("age") + " " + list.get(i).get("name"));
//        }
