/*
 * n! Ãâ·Â
 * */
import java.util.Scanner;

class Bj10872 {
	public int solution(int n) {
		int answer = 1;
		for(int i=n; i>0; i--) {
			answer *= i;
		}
		return answer;
	}

	public static void main(String[] args) {
		Bj10872 T = new Bj10872();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}

}