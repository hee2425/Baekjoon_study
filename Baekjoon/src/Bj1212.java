import java.util.Scanner;
/*
 * 2진수->8진수 3개씩 끊어서 10진수로 변환
 * 8진수->2진수
 * 숫자 하나당 2진수로 변환 
 * 맨 앞숫자의  0은 빼기
 * 나머지 숫자 2진수 변환시 3칸 채우기
 * 
 * Integer.toBinaryString() --> 2진수 변환 함수
 * */

public class Bj1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<len; i++) {
			String answer = Integer.toBinaryString(str.charAt(i)-'0');
			if(answer.length()==2 && i!=0) answer="0"+answer;
			else if(answer.length()==1 && i!=0) answer="00"+answer;
			
			sb.append(answer);
		}
		
		System.out.println(sb);
		
	}
}