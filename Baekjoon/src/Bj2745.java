/*
 * 10진법으로 바꿔 출력
 * 
 * 백준 11005 풀이 참고
 * 
 * 2진법을 10진법으로 곱할때 각 자리 숫자에 2의 1승, 2승, 3승.. 등을 곱한다
 * 위를 참고하여 각 자리의 연산 후 입력받은 b를 계속 곱해준다
 * */


import java.util.Scanner;
public class Bj2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		
		int temp = 1;  //각 자리의 수 연산하기 위한 값
		int answer = 0;
		
		for(int i=n.length()-1; i >= 0; i--) {
			char c = n.charAt(i);
			
			if('A' <= c && c <= 'Z') {
				answer += (c -'A'+10)*temp;
			}else {
				answer += (c - '0')*temp;
			}
			temp  = temp*b;
		}
		System.out.println(answer);
		
	}

}