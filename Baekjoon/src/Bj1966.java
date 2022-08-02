/*
 * 테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)
 * 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)
 * 이때 맨 왼쪽은 0번째
 * 두 번째 줄에는 N개 문서의 중요도
 * 
 * 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면
 * 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
 * */
import java.util.LinkedList;
import java.util.Scanner;
public class Bj1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int n,m;
		int imp;
		
		for(int i=0; i<tc; i++) {
			LinkedList<int[]> queue = new LinkedList<>();
			imp = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			for(int j=0; j<n; j++) {
				queue.add(new int[] {j, sc.nextInt()});
			}
			while(!queue.isEmpty()) {
				int[] cur = queue.poll();
				boolean can = true;
				for(int[] q : queue) {
					if(q[1]>cur[1]) {
						can = false;
					}
				}
				if(can) {
					imp++;
					if(cur[0] == m) break;
				}
				else queue.add(cur);
			}
			System.out.println(imp);
		}
		
	}

}
