import java.io.*;
public class Bj11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());  //int형으로
		String[] input = br.readLine().split("");   //string배열에 split해서 담기
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(input[i]);  //int형으로 계산
		}
		
		System.out.println(sum);
	}

}
