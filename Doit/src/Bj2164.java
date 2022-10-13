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
			myQ.poll();  //�� ��ī�� ����
			myQ.add(myQ.poll());  //���� ī�� �� �ڷ�
			
		}
		System.out.println(myQ.poll());
	}

}
