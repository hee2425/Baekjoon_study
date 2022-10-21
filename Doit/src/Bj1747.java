import java.io.*;
public class Bj1747 {
	static int n;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		if(n==1) n=2;
		while(!(get_Prime(n) == true && get_Palin(n) == true)) {
			n += 1;
		}
		System.out.println(n);
	}
	
	public static boolean get_Prime(int a) {
		for(int i=2; i*i<=a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean get_Palin(int a) {
		String str = Integer.toString(a);
		StringBuilder sb = new StringBuilder(str);
		
		if(!str.equals(sb.reverse().toString())) {
			return false;
		}
		return true;
	}
}
