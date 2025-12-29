import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =  Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];

        int count = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = count;

            count++;
        }

        int temp = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

                for (int j = start ; j <= start+(end-start+1)/2-1 ; j++ ) {
                temp = arr[j-1];
                arr[j-1] = arr[(end - (j-start))- 1];
                arr[(end - (j-start))- 1] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}