import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam22 {
    public static void main(String[] args)throws IOException{
    //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

    // 출력
    // 1부터 n까지 합을 출력한다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int i = A; i >= 1; i--){
        sum += i;
    }
    System.out.println(sum);

    // 만약 i를 0으로 하게 될 경우에 불필요하게 0을 한번 더 수행하게 됨. 따라서 1로 교체하자!

    }
}
