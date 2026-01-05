import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            int r = N % B;
            sb.append(r < 10 ? (char)('0' + r) : (char)('A' + r -10));
            N /= B;
        }
        System.out.print(sb.reverse());
    }
}