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
			if(sum == N) { //���� N�� ���� ���
				end_index++;
				sum += end_index;
				count++;
			}
			else if(sum > N){  //���� N���� ū��� 
				sum -= start_index;
				start_index++;
			}else {  //���� N���� ���� ���
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}

}
