/*
 * 진법 변환2
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 * 
 * 캐릭터형 어레이리스트를 선언해준뒤 
 * 나머지 9이하와 10이상의 경우를 나누어 아스키코드값을 더해 리스트에 저장
 * 진법 구하기 경우 뒤에서부터 출력해야하므로 리스트 거꾸로 출력
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bj11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		List<Character> list = new ArrayList<>();
		while(n>0) {
			if(n % b <10) {  
				list.add((char)(n%b +'0'));
			}
			else {  //10 이상이면 나머지 값에서 10 빼고 아스키 코드 값 A 더함
				list.add((char)(n%b -10 +'A'));
			}
			n = n/b;
		}
		for(int i = list.size()-1; i >= 0; i--) {  //리스트 거꾸로 출력
			System.out.print(list.get(i));
		}
	}

}