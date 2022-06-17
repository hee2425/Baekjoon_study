/*
 * 주어진 문자 S
 * S의 서로 다른 부분 문자열의 개수 출력
 * */
import java.util.*;
public class Bj11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int cnt = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=i; j<arr.length; j++) {
				String tmp1 = str.substring(i+1);  //뒷문자부터 선택해서 나오는 문자열
				String tmp2 = str.substring(i, j+1);  //선택된 문자기준 나올 수 있는 모든 문자열
				if(tmp1.contains(tmp2)) {
					continue;
				}else {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}