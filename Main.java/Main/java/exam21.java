import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class exam21 {
    /*A+B - 3
    시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
    1 초	256 MB	368145	215647	179393	58.570%
    문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    출력
    각 테스트 케이스마다 A+B를 출력한다.*/
    public static void main(String[] args) throws IOException{    

       
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
        String[] ar = br.readLine().split(" ");
            int A = Integer.parseInt(ar[0]);
            int B = Integer.parseInt(ar[1]);
            System.out.println(A+B);
        }

        
    }
}
