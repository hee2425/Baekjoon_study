/*두 수의 최소공배수 
 * 
 * */
import java.util.*;
public class Bj1934 {
	
	//최소공약수
	public static int gcd(int a, int b)
	{
		if (b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}

	//최소공배수
	public static int lcm(int a, int b) 
	{
		return a * b / gcd(a, b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(lcm(A,B));
		}
		
	}
}