import java.util.Scanner;

/* ���ٲ���6
 * ����, ������ �Ÿ� ����
 * �� �Ÿ��� �ִ�����
 * 
 * */

public class Bj17087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  //���� ��
		int s = sc.nextInt();  //������ ��ġ
		int[] ds_pos_arr = new int [n];  //������� �Ÿ� �迭
		
		for(int i=0; i<n; i++) {
			int dspos = sc.nextInt();  //������ ��ġ
			
			ds_pos_arr[i] = (s > dspos) ? s-dspos : dspos-s; 
		}
		
		int gcd = ds_pos_arr[0];  //���� �Ѹ��϶�
		
		if(n > 1) {
			for(int i=1; i<n; i++) {
				gcd = gcd(gcd, ds_pos_arr[i]);
			}
		}
		
		System.out.println(gcd);
		
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	

}