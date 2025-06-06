// 문제
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력
// 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

// 놓친 점: 출력 값은 실수로 나오기 때문에 형변환이 필요하다 혹은 애초에 double로 A와 B를 받아도 괜찮다

import java.util.Scanner;

public class exam03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double A = in.nextInt();
        double B = in.nextInt();

        System.out.println(A/B);    

    }
}
