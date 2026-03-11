package boj.deepending2.p2108;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 1. 산술평균
        double result = Math.round((double)sum / N);
        sb.append((int)result).append("\n");

        // 2. 중앙값
        Arrays.sort(arr);
        sb.append(arr[N / 2]).append("\n");

        // 3. 최빈값
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxFreq = 0;

        for (int x : arr) {
            int freq = hashMap.getOrDefault(x, 0) + 1;
            hashMap.put(x, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);

        if (modes.size() == 1) {
            sb.append(modes.get(0)).append("\n");
        } else {
            sb.append(modes.get(1)).append("\n");
        }

        // 4. 범위
        sb.append(arr[N - 1] - arr[0]).append("\n");

        System.out.print(sb);
    }
}