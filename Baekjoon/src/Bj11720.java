import java.io.*;
public class Bj11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());  //int������
		String[] input = br.readLine().split("");   //string�迭�� split�ؼ� ���
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(input[i]);  //int������ ���
		}
		
		System.out.println(sum);
	}

}
