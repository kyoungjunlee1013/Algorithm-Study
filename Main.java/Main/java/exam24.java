import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam24 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i <= N/4; i++){
            System.out.print("long ");
        }   
        System.out.println("int");
    }
}
