import java.util.*;

public class Bj2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> myQ = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			myQ.add(i);
		}
		while(myQ.size()>1) {
			myQ.poll();  //맨 위카드 버림
			myQ.add(myQ.poll());  //맨위 카드 맨 뒤로
			
		}
		System.out.println(myQ.poll());
	}

}
