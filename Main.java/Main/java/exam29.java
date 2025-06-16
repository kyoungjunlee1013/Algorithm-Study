import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam29 {
    public static void main(String[] args)throws IOException{     
    // 문제
    // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    // 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    // 입력
    // 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
    // 출력
    // 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int j = 0;
    for(int i=0; i<A; i++){
        StringBuilder sb = new StringBuilder();

            for(int k=1; k<A-j; k++){
                sb.append(" ");
                
            }
            for(j=0; j<=i; j++){
                
                sb.append("*");
            }
            
            
        System.out.println(sb);
        
    }
    }
}
