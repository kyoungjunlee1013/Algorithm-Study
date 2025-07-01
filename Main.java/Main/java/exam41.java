import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ar1 = br.readLine().split(" ");
        int N = Integer.parseInt(ar1[0]);
        int M = Integer.parseInt(ar1[1]);

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            String[] ar2 = br.readLine().split(" ");
            int i = Integer.parseInt(ar2[0]) - 1;  // 0-based index
            int j = Integer.parseInt(ar2[1]) - 1;

            while (i < j) {
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }

        // 공백 구분 한 줄 출력
        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
