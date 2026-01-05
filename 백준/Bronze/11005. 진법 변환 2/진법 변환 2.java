import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        char[] arr = new char[32];
        int arrIndex = arr.length;
        int total = N;

        while (total > 0) {
            if (total % B <= 9) {
                arr[--arrIndex] = (char) (total % B + '0');
                total /= B;
            } else if (10 <= total % B && total % B <= 35) {
                arr[--arrIndex] = (char) (total % B + 'A' - 10);
                total /= B;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arrIndex; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.print(sb);
    }
}
