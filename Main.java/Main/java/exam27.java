import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam27 {
    public static void main(String[] args)throws IOException{
    //문제
    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    // 입력
    // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    // 출력
    // 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int A = Integer.parseInt(br.readLine());

        for(int i=0; i<A; i++){
            String[] ar = br.readLine().split(" ");
            int num1 = Integer.parseInt(ar[0]);
            int num2 = Integer.parseInt(ar[1]);

            sb.append("Case ")
              .append("#")
              .append(i+1)
              .append(": ")
              .append(num1 +" + "+num2+" = ")
              .append(num1+num2)
              .append("\n");
        }
        System.out.println(sb);
    }
}
