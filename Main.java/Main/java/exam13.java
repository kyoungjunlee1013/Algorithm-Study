import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam13 {
    public static void main(String[] args) throws IOException{
            //문제
            //두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
            // 입력
            // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

            // 출력
            // 첫째 줄에 다음 세 가지 중 하나를 출력한다.

            // A가 B보다 큰 경우에는 '>'를 출력한다.
            // A가 B보다 작은 경우에는 '<'를 출력한다.
            // A와 B가 같은 경우에는 '=='를 출력한다.
            // 제한
            // -10,000 ≤ A, B ≤ 10,000


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String[] ar = br.readLine().split(" ");

            String str;
            int A = Integer.parseInt(ar[0]);
            int B = Integer.parseInt(ar[1]);

            // if(A>B){
            //     System.out.println(">");
            // }else if(A<B) {
            //     System.out.println("<");
            // }else{
            //     System.out.println("==");
            // }
             
            // //3항 연산자 사용
            // String str = ((A>B) ? ">" : (A<B) ? "<" : "==");
            // System.out.println(str);

            //3항 연산자를 더 간단히 바로 print 하는 방법.
            System.out.println(str = (A>B) ? ">" : (((A<B) ? "<" : "==")));
    }
}   
