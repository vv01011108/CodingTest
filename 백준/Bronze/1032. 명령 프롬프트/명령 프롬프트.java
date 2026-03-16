import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0].length(); i++) {
            boolean same = true;

            for (int j = 0; j < N - 1; j++) {
                if (arr[j].charAt(i) != arr[j + 1].charAt(i)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                sb.append(arr[0].charAt(i));
            } else {
                sb.append("?");
            }
        }
        
        System.out.print(sb);
    }
}