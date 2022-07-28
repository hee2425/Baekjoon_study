
/*������ : N���� ������ ���� N���� ���� ��  Average
 * �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��  Median
 * �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��  Mod
 * ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����  Range
 * */
import java.io.*;
import java.util.*;

public class Bj2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hashmap = new HashMap<>();

		int n = Integer.parseInt(br.readLine());
		double sum = 0;
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			sum += (double) temp;
			list.add(temp);
		}

		// �������� ����
		Collections.sort(list);

		int max = Collections.max(list);
		int min = Collections.min(list);
		int Range =0;
		
		if(max < 0 && min < 0) {// �Ѵ� ����
			Range = Math.abs(max-min);
			
		}
		else if(max > 0 && min > 0) {// �Ѵ� ��� �� ���
			Range = max-min;
		}
		else {// min, max���� ��ȣ�� �ٸ� ��, ���߿� �ϳ��� 0�� ��
			max = Math.abs(max);
			min = Math.abs(min);
			Range = max+min;
		}

		int Average = (int) Math.round(sum/n);  //�Ҽ��� ù°�ڸ������� �ݿø�
		int Median = list.get(n/2); 
		
		//�ֺ� ���ϱ� 
		int Mode = 0;
		for(int num : list) {
			// ���ڰ� �ѹ� ���� ������ 1�� �߰���.
			// getOrDefault(key, value) 
			// Ű�� �����ϸ� ���ε� �� ��ȯ, ������ ����Ʈ�� ��ȯ
			hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
		}

		int numbers = 0;
		for(int key : hashmap.values()) {
			numbers = Math.max(numbers, key);
		}

		// ������ ����ߴ� list�� �ٽ� ����ϱ� ���� clear ó��
		// �ֺ���� ���ϱ� �ֺ���� ���� ���� ���� list�� ����
		list.clear();
		for(int key : hashmap.keySet()) {
			if(hashmap.get(key) == numbers) {
				list.add(key);
			}
		}

		// �ֺ���� 2�� �̻��� ��� 2��°�� ���� ���� �̾Ƴ��� �ϱ� ������ list�� ����
		Collections.sort(list);

		// �ֺ���� �󵵼��� ���� ���� 2�� �̻��ΰ�� index 1�� ���� �ֺ���� ����
		// 1���� ���� �״�� index 0�� �ֺ���� ����
		if(list.size() >= 2) {
			Mode = list.get(1);
		}
		else {
			Mode = list.get(0);
		}

		System.out.println(Average);
		System.out.println(Median);
		System.out.println(Mode);
		System.out.println(Range);
	}
}