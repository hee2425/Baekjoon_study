import java.io.*;
import java.util.Arrays;

public class Bj1377 {
	
	static class mData implements Comparable<mData>{
		int value;
		int index;
		
		public mData(int value, int index) {
			super();
			this.value = value;
			this.index = index;
		}
		
		@Override
		public int compareTo(mData o) {
			return this.value - o.value;
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		mData[] A = new mData[n];
		for(int i=0; i<n; i++) {
			A[i] = new mData(Integer.parseInt(reader.readLine()), i);	
		}
		Arrays.sort(A);
		int Max = 0;
		for(int i=0; i<n; i++) {
			if(Max < A[i].index-i) {
				Max = A[i].index-i;
			}
		}
		System.out.println(Max+1);
	}
	
	
}
