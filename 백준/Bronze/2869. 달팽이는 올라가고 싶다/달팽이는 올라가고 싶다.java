import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 올라감
        int B = Integer.parseInt(st.nextToken()); // 내려감
        int V = Integer.parseInt(st.nextToken()); // 나무 높이

        // int day = (V - A) / (A - B); 나머지 올림
        int day = (V - B - 1) / (A- B);
        System.out.print(day + 1);
    }
}