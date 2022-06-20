/*
 * 소인수분해
 * 
 * */
import java.io.*;
public class Bj11653 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//2부터 1씩 늘려가면서 나눔
		for(int i = 2; i<=N; i++ ) {
			for(;;) { //i로 더이상 안나누어질때까지 무한 루프
				if(N%i == 0) {
					N = N/i;
					System.out.println(i);
				}
				else {
					break;
				}
			}
		}
	}

}
