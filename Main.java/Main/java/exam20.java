import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam20 {
   /*  N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    입력
    첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
    출력
    출력형식과 같게 N*1부터 N*9까지 출력한다.*/

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int[] mul = {1,2,3,4,5,6,7,8,9};

        for(int i=0; i<mul.length; i++){

            System.out.println(A + " * " + mul[i] + " = " + A*mul[i]);
        }
    }
}
