/*������ x
 * Ű y 
 * ��ġ(x,y)
 * ���� �ڽź��� �� ū ��ġ�� ����� k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�.*/

import java.util.Scanner;
public class Bj7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rank = 0; //��ġ���
		
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
