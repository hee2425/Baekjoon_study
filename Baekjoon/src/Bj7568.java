/*몸무게 x
 * 키 y 
 * 덩치(x,y)
 * 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다.*/

import java.util.Scanner;
public class Bj7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rank = 0; //덩치등수
		
		int[] xarr = new int[n];
		int[] yarr = new int[n];
		
		for(int i=0; i<n; i++) {
			xarr[i] = sc.nextInt();
			yarr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(xarr[i]<xarr[j] && yarr[i]<yarr[j]) {
					rank++;
				}
			}
			System.out.print(rank+1);
			System.out.print(" ");
			rank = 0;
		}
	}

}
