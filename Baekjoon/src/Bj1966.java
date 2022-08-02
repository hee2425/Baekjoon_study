/*
 * �׽�Ʈ���̽��� ù ��° �ٿ��� ������ ���� N(1 �� N �� 100)
 * �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue���� �� ��°�� ���� �ִ����� ��Ÿ���� ���� M(0 �� M < N)
 * �̶� �� ������ 0��°
 * �� ��° �ٿ��� N�� ������ �߿䵵
 * 
 * ������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�
 * �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
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
