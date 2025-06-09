import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam10 {
    public static void main(String[] args) throws IOException{
        //꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
        //입력
        //첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
        //출력
        //A+B+C의 값을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");  // 공백으로 나눔

        Long A = Long.parseLong(parts[0]);
        Long B = Long.parseLong(parts[1]);
        Long C = Long.parseLong(parts[2]);

        System.out.println(A+B+C);

    }
     
}