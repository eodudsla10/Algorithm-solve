package PRO;
public class PRO86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int max_col = 0;
        int max_row = 0;
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                int col = Math.max(sizes[i][0], sizes[i][1]);
                int row = Math.min(sizes[i][0], sizes[i][1]);
                max_col = Math.max(max_col, col);
                max_row = Math.max(max_row, row);
            }
        }
        answer = max_col * max_row;
        return answer;

    }
}

//기존 풀이
//    public static int solution(int[][] sizes) {
//        int max_col = 0;
//        int max_row = 0;
//        int answer = 0;
//        int temp = 0;
//        System.out.println(sizes.length);
//
//        //정렬
//        for (int i = 0; i < sizes.length; i++) {
//            for (int j = 0; j < sizes[0].length; j++) {
//                if (sizes[i][0] < sizes[i][1]) {
//                    temp = sizes[i][0];
//                    sizes[i][0] = sizes[i][1];
//                    sizes[i][1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < sizes.length; i++) {
//            for (int j = 0; j < sizes[0].length; j++) {
//                max_col = Math.max(max_col, sizes[i][0]);
//                max_row = Math.max(max_row, sizes[i][1]);
//
//            }
//        }
//        answer = max_col * max_row;
//        return answer;
//    }