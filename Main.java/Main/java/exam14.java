import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam14 {
    public static void main(String[] args) throws IOException{
    // 문제
    // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
    // 입력
    // 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
    // 출력
    // 시험 성적을 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int grade =Integer.parseInt(br.readLine());
        
        // if(100>= grade && grade >=90){
        //     System.out.println("A");
        // }else if(89>= grade && grade >= 80){
        //     System.out.println("B");
        // }else if(79>= grade && grade >= 70){
        //     System.out.println("C");
        // }else if(69>= grade && grade >=60){
        //     System.out.println("D");
        // }else
        // System.out.println("F");

        String num = ((100 >= grade) ? "A" 
        : (89>= grade) ? "B" 
        : (79>= grade) ? "C" 
        : (69>= grade) ? "D" : "F");
        System.out.println(num);
    }
}
