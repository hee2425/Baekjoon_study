/*
 * ���μ�����
 * 
 * */
import java.io.*;
public class Bj11653 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//2���� 1�� �÷����鼭 ����
		for(int i = 2; i<=N; i++ ) {
			for(;;) { //i�� ���̻� �ȳ������������� ���� ����
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
