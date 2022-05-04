package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = (int) Math.sqrt(n);
        for (int i = 2; i <= num; i++) {
                while (true) {
                    if (n % i != 0) {
                        break;
                    }
                    System.out.println(i);
                    n /= i;
                }
            }
        if (n != 1) {
            System.out.println(n);
        }
    }

}
