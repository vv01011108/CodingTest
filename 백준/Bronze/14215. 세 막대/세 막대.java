import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A >= B && A >= C) {
            if (A >= B + C) {
                A = B + C - 1;
            }
        } else if (B >= A && B >= C) {
            if (B >= A + C) {
                B = A + C - 1;
            }
        } else {
            if (C >= A + B) {
                C = A + B - 1;
            }
        }

        System.out.print(A + B + C);
    }
}