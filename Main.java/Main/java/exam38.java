import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam38 {
    public static void main(String[] args) throws IOException{

//         문제
// 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
// 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
// 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
// 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
// 도현이는 입력으로 주어진 순서대로 공을 교환한다.
// 출력
// 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //바구니의 갯수와 공을 움직일 횟수를 적는다.
    String ar1[] = br.readLine().split(" ");
    // 해당 값을 변수 A와 B에 담아준다.
    int A = Integer.parseInt(ar1[0]);
    int B = Integer.parseInt(ar1[1]);
    
    int ar3[] = new int[A];
    for(int j=0; j<A; j++){
        ar3[j] = j+1;        
    }

    // 공을 움직이고자 하는 횟수 만큼 반복문을 돌려서 공의 위치를 바꿔준다.
    for(int i=0; i<B; i++){
        String ar2[] = br.readLine().split(" ");
    // 공을 변수 F와 K에 넣어준다.
        int F = Integer.parseInt(ar2[0]);
        int K = Integer.parseInt(ar2[1]);
        int T = 0;
        T = ar3[F-1];
        ar3[F-1] = ar3[K-1];    
        ar3[K-1] = T;
    }
        for(int i=0; i<A; i++)
        System.out.print(ar3[i]+" ");
    }
}
