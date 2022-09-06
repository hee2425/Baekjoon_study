import java.util.Scanner;
public class Bj1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		for(int i=0; i<n; i++) {
			if(array[i]>max) max = array[i];
			sum += array[i];
		}
		System.out.println((sum*100.0)/max/3);
	}

}
