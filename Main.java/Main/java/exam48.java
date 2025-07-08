import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam48 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] alphabet = new int[26]; // 알파벳 위치 저장용
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1; // 초기값은 모두 -1로 설정
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a';

            // 처음 나오는 문자일 경우에만 저장
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
