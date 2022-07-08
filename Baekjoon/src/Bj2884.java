import java.util.Scanner;
public class Bj2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int total = h*60+m;
		total -= 45;
		
		h = total/60;
		m = total%60; 
		if(m<0) {
			h = 23;
			m = 60+m;
		}
		
		System.out.println(h+" "+m);
	}

}
