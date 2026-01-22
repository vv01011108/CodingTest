import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>(); // key = 이름, value = 숫자
        String[] arr = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= M; i++) {
            String input = br.readLine();
            try {
                int num = Integer.parseInt(input); // 숫자 -> 문자열
                sb.append(arr[num]).append("\n");
            } catch (NumberFormatException e){ // 문자열 -> 숫자
                sb.append(map.get(input)).append("\n");
            }
        }

        System.out.print(sb);
    }
}