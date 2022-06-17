/*
 * 10-->-2 진법
 * 나머지는 항상 양수
 * 나머지를 양수로 만들기 위해서 주석과 같이 몫을 올림처리 해줌
 * 
 * -13 = -2*6 -1-----------> -13 = -1*7 +1
 * 7 = -2*-4 -1------------> 7 = -2*-3 +1
 * -3 = -2*1 -1------------> -3 = -2*2 +1
 * 2 = -2*-1 +0
 * -1 = -2*0 -1------------> -1 = -2*1 +1
 * 1 = -2*0 +1 
 * 
 * 110111
 * */

import java.util.Scanner;
public class Bj2089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println(0);
		}else {
			while(input != 1) {
				sb.append(Math.abs(input % -2));  //절대값 반환
				input = (int)Math.ceil((double) input/(-2));  //올림
			}
			sb.append(input);
			
			System.out.println(sb.reverse());  //문자열 뒤집기
		}
	}

}