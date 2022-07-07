import java.util.Scanner;
public class Bj2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		 
		int one = b%10;
		int ten = (b/10)%10;
		int hund = (b/10)/10;
		
		System.out.println(a*one);
		System.out.println(a*ten);
		System.out.println(a*hund);
		System.out.println(a*b);
	}

}
