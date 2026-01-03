import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 정답과의 절대오차 또는 상대오차가 10^-4 이하이면 정답으로 인정

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subjects = new String[20]; // 과목
        float[] credits = new float[20]; // 학점
        String[] grades = new String[20]; // 등급

        float creditsSum = 0; // 학점 합
        float creditsXgradesSum = 0; // 학점 * 등급 합

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subjects[i] = st.nextToken();
            credits[i] = Float.parseFloat(st.nextToken());
            grades[i] = st.nextToken();

            // 학점 합
            if (!grades[i].equals("P"))
                creditsSum += credits[i];

            // 학점 * 등급 합
            switch (grades[i]) {
                case "A+":
                    creditsXgradesSum += 4.5f * credits[i];
                    break;
                case "A0":
                    creditsXgradesSum += 4.0f * credits[i];
                    break;
                case "B+":
                    creditsXgradesSum += 3.5f * credits[i];
                    break;
                case "B0":
                    creditsXgradesSum += 3.0f * credits[i];
                    break;
                case "C+":
                    creditsXgradesSum += 2.5f * credits[i];
                    break;
                case "C0":
                    creditsXgradesSum += 2.0f * credits[i];
                    break;
                case "D+":
                    creditsXgradesSum += 1.5f * credits[i];
                    break;
                case "D0":
                    creditsXgradesSum += credits[i];
                    break;
                case "F":
                    creditsSum += 0.0f * credits[i];
                    break;
            }

        }

        // 과목 평점
        float result = creditsXgradesSum / creditsSum;
        System.out.print(String.format("%.6f", result));

    }
}