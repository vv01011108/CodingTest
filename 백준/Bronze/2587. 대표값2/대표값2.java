import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int a = 0;
        int b = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            a += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(a / 5); // 평균
        System.out.println(arr[2]); // 중앙값
    }
}