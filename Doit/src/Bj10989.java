import java.io.*;
public class Bj10989 {
	public static int[] A;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Radix_sort(A, 5);
		for(int i=0; i<n; i++) {
			bw.write(A[i]+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void Radix_sort(int[] A, int max_size) {
		int[] output = new int[A.length];
		int jarisu = 1;
		int count = 0;
		while(count != max_size) {
			int[] bucket = new int[10];
			for(int i=0; i<A.length; i++) {
				bucket[(A[i]/jarisu)%10]++;
			}
			for(int i=1; i<10; i++) {
				bucket[i] += bucket[i-1];
			}
			for(int i=A.length-1; i>=0; i--) {
				output[bucket[(A[i]/jarisu % 10)]-1] = A[i];
				bucket[(A[i] / jarisu) % 10]--;
			}
			for(int i=0; i<A.length; i++) {
				A[i] = output[i];
				
			}
			jarisu = jarisu * 10;
			count++;
		}
	}

}
