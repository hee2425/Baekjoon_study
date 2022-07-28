import java.util.Arrays;
import java.util.Scanner;
public class Bj11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] xy = new int[n][2];
		for(int i=0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		Arrays.sort(xy, (o1, o2) ->
			o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]
				);
		
		for(int i=0; i<n; i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
	}

}
