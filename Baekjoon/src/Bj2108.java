
/*산술평균 : N개의 수들의 합을 N으로 나눈 값  Average
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값  Median
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값  Mod
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이  Range
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

		// 오름차순 정렬
		Collections.sort(list);

		int max = Collections.max(list);
		int min = Collections.min(list);
		int Range =0;
		
		if(max < 0 && min < 0) {// 둘다 음수
			Range = Math.abs(max-min);
			
		}
		else if(max > 0 && min > 0) {// 둘다 양수 일 경우
			Range = max-min;
		}
		else {// min, max서로 부호가 다를 때, 둘중에 하나라도 0일 때
			max = Math.abs(max);
			min = Math.abs(min);
			Range = max+min;
		}

		int Average = (int) Math.round(sum/n);  //소숫점 첫째자리수에서 반올림
		int Median = list.get(n/2); 
		
		//최빈값 구하기 
		int Mode = 0;
		for(int num : list) {
			// 숫자가 한번 나올 때마다 1이 추가됨.
			// getOrDefault(key, value) 
			// 키가 존재하면 매핑된 값 반환, 없으면 디폴트값 반환
			hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
		}

		int numbers = 0;
		for(int key : hashmap.values()) {
			numbers = Math.max(numbers, key);
		}

		// 위에서 사용했던 list를 다시 사용하기 위해 clear 처리
		// 최빈수를 구하기 최빈수와 같은 빈도의 수를 list에 삽입
		list.clear();
		for(int key : hashmap.keySet()) {
			if(hashmap.get(key) == numbers) {
				list.add(key);
			}
		}

		// 최빈수가 2개 이상일 경우 2번째로 작은 값을 뽑아내야 하기 때문에 list를 정렬
		Collections.sort(list);

		// 최빈수와 빈도수가 같은 수가 2개 이상인경우 index 1의 값을 최빈수로 설정
		// 1개일 경우는 그대로 index 0을 최빈수로 설정
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