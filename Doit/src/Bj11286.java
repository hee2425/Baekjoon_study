import java.io.*;
import java.util.*;

public class Bj11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) ->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs) {
				return o1 > o2 ? 1 : -1;   //절댓값이 같으면 음수 우선 정렬
			}else {
				return first_abs - second_abs;  //절댓값 기준으로 정렬
			}
		});
		
		for(int i=0; i<n; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(pq.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.add(request);
			}
		}
		
	}

}
