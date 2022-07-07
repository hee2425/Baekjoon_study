import java.util.Scanner;
import java.util.HashSet;
public class Bj3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hash.add(sc.nextInt() % 42);
		}
		
		sc.close();
		System.out.println(hash.size());
	}
	
}
