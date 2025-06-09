import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam09 {
    public static void main(String[] args) throws IOException{
        // (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
    
        int one = B % 10;
        int ten = (B / 10) % 10;
        int hundred = B / 100;

        System.out.println(A * one);
        System.out.println(A * ten);
        System.out.println(A * hundred);
        System.out.println(A * B);
    }

    // BufferedReader는 Scanner와 달리 대용량 데이터를 불러오기 쉽고, 속도가 빠름 하지만, BufferedReader는 문자열만 받기 떄문에 내부적으로 
    // 자료형을 변경해야하는 번거로움이 존재한다. system.in은 바이트 단위고, 이를 inputstreamreader를 통해 문자열로 변경하고 이후 parsing을 통해 int형으로 변경

}
