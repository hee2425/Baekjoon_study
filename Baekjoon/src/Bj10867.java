import java.util.*;

public class Bj10867 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			hs.add(sc.nextInt());
		}
		
		Integer[] arr = hs.toArray(new Integer[0]);
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
			
	}

}