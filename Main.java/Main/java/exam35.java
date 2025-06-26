import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam35 {
    public static void main(String[] args)throws IOException{
    //문제
    // N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
    // 입력
    // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
    // 출력
    // 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long A = Integer.parseInt(br.readLine());
        
        String[] ar = br.readLine().split(" ");
        
        long MAX = 0;
        long MIN = 0;

        for(int i=0; i<A; i++){            
            long B = Long.parseLong(ar[i]);
            long C = Long.parseLong(ar[i]);
            
           B = Long.max(MAX, B);
           C = Long.min(C, C);

           MAX = B;
           MIN = C;
            
        }
        System.out.println(MAX);
        System.out.println(MIN);
        
    }
}
