import java.util.Scanner;
public class Bj2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) {
			if(sum == N) { //합이 N과 같은 경우
				end_index++;
				sum += end_index;
				count++;
			}
			else if(sum > N){  //합이 N보다 큰경우 
				sum -= start_index;
				start_index++;
			}else {  //합이 N보다 작은 경우
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}

}
