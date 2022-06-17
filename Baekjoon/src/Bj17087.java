import java.util.Scanner;

/* 숨바꼭질6
 * 수빈, 동생들 거리 구함
 * 각 거리의 최대공약수
 * 
 * */

public class Bj17087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  //동생 수
		int s = sc.nextInt();  //수빈이 위치
		int[] ds_pos_arr = new int [n];  //동생들과 거리 배열
		
		for(int i=0; i<n; i++) {
			int dspos = sc.nextInt();  //동생들 위치
			
			ds_pos_arr[i] = (s > dspos) ? s-dspos : dspos-s; 
		}
		
		int gcd = ds_pos_arr[0];  //동생 한명일때
		
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