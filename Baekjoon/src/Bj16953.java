/*A->B
 * 2를 곱한다
 * 1을 수의 가장 오른쪽에 추가한다
 * 
 * */
import java.util.*;
public class Bj16953 {
	static long A,B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		
		System.out.println(bfs());
	}
	
	static long bfs() {
		int count = 0;
		Queue<Long> Q = new LinkedList<>();
		Q.add(A);
		
		while(!Q.isEmpty()) {
			int size = Q.size();
			
			for(int s=0; s<size; s++) {
				long now = Q.poll();
				
				if(now == B) return count+1;
				if(now*2 <=B) Q.add(now*2);
				if(now*10+1<=B) Q.add(now*10+1);
			}
			count++;
		}
		return -1;
	}

}