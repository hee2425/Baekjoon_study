/*
 * �������� ����
 * 4���� ū ��� ¦���� �� Ȧ�� �Ҽ��� ������ ��Ÿ�� �� �ִ�
 * "Goldbach's conjecture is wrong."
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bj6588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//�����佺�׽����� ü  
			//�Ҽ� false
			boolean[] prime = new boolean[1000001];
			prime[0] = prime[1] = true;
			for(int i=2; i<1000001; i++) {
				if(!prime[i]) 
					for(int j=i+i; j<1000001; j+=i) {
						prime[j] = true;
					}			
			}
			
			while(true) {
				int tmp = Integer.parseInt(br.readLine());
				if(tmp == 0) {break;}
				
				boolean flag = false;
				
				for(int i=3; i<tmp-2; i++) {
					if(!prime[i] && !prime[tmp-i] && i%2 ==1 && (tmp-i)%2 ==1) {
						flag = true;
						System.out.println(tmp + " = " + i + " + " + (tmp - i));
						break;
					}
				}
				if(!flag) System.out.println("Goldbach's conjecture is wrong.");	
			}
		}
}
