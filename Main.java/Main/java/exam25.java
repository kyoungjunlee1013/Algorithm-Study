import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam25 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long T = Long.parseLong(br.readLine());

        for(int i = 0; i<T; i++){
            String[] ar = (br.readLine().split(" "));
            long A = Long.parseLong(ar[0]);
            long B = Long.parseLong(ar[1]);
            System.out.println(A+B);
        }
        
    }
}
