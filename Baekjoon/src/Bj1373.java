import java.io.*;
/*
 * 2진수 -> 8진수
 * 3자리씩 끊어 10진수 변환 -> 8진수
 * 
 * 문자=1 아스키 코드=49
 * 문자=0 아스키코드=48
 * */

public class Bj1373 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int l = str.length();
		if(l % 3 ==1) {  //세자리씩 끊었을때 한자리 남은 경우
			sb.append(str.charAt(0));
		}else if(l % 3 ==2) {  //두자리 남은 경우
			sb.append((str.charAt(0) - '0') *2 +(str.charAt(1) - '0'));			
		}
		
		//나머지 경우
		for(int i = l%3; i<l; i+=3) {
			sb.append((str.charAt(i)-'0') *4 +(str.charAt(i+1) - '0') *2 + (str.charAt(i+2) - '0'));
			
		}
		
		System.out.println(sb);
	}

}