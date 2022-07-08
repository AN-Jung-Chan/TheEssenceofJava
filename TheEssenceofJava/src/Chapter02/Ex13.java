package Chapter02;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/* 제어문  if 와 else
 * 프로그램 실행 코드의 흐름을 제어하는 구문
 * 조건문 : 조건에 따른 실행 흐름 분기
 * 반복문 : 조건에 따른 특정 영역의 코드를 반복
 */

public class Ex13 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("-- if --");
		// if문은 true, false로 조건제어!!

		System.out.print("숫자를 입력하세요(0~9) : ");

		int a = Integer.parseInt(br.readLine());

		if (a > 5) {
			System.out.println("a는 5보다 큰 수다.");
			System.out.println("a의 값은 : " + a);
		}

		System.out.println();

		
		System.out.println("-- if ~ else --");
		/*	if ~ else 구문
		 *	if 문이 참이면 if의 종속문장 실행  
		 *	if 문의 조건이 거짓이면 else의 종속문장 실행
		 *	둘 중 하나만 실행된다!
		 */
		
		System.out.print("숫자를 입력하세요(0~9) : ");

		int b = Integer.parseInt(br.readLine());

		if (b % 2 == 0) {
			System.out.println("입력하신 " + b + " 는 짝수 입니다.");
		} else {
			System.out.println("입력하신 " + b + " 는 홀수 입니다.");

		}
		
		System.out.println();

		System.out.println("-- if ~ else if --");
		/*if ~ else if 구문
		 * 여러 조건을 연결하여 참인 경우의 종속문장만 실행
		 * 마지막 else는 필요에 따라 사용 또는 미사용 할 수 있음.
		 * **각 else if 구문마다 조건을 걸면됨.
		 */
		
		System.out.println("문자 입력 : ");
		char cr = (char) System.in.read();
		
		if(cr == 'A') {
			System.out.println("입력한 문자는 A 입니다.");
		} else if (cr == 'B'){
			System.out.println("입력한 문자는 B 입니다.");		
		} else if (cr == 'C') {
			System.out.println("입력한 문자는 C 입니다.");			
		} else {
			System.out.println("입력한 문자는 A, B, C 이외의 문자입니다.");
		}
		
		
		// 문자열은 char형으로 바꿔줘야 인식하나봄
		// charAt 따로 공부하기. **
//		String str = br.readLine();
//		char c = str.charAt(4);
//		System.out.println("입력한 문자는 : " + c);
//		
//		if(str == "a") {
//			System.out.println("입력한 문자가 맞습니다.");
//		} else if (str == "b") {
//			System.out.println("입력한 문자가 맞습니다.");
//		} else
//			System.out.println("입력한 문자가 아닙니다.");
		
		
		
		
		
		
		
		
	}
}
