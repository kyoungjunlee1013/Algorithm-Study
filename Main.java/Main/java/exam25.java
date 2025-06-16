import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam25 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long T = Long.parseLong(br.readLine());

        for(int i = 0; i<T; i++){
            String[] ar = (br.readLine().split(" "));
            long A = Long.parseLong(ar[0]);
            long B = Long.parseLong(ar[1]);
        
            bw.write((A+B)+ "\n");
        }
            bw.flush();
            bw.close();
            br.close();        

            //BufferedReader와 Bufferedwriter를 둘 다 쓰거나, BufferedReader와 StringbUilder를 같이 쓴다.
    }
}
