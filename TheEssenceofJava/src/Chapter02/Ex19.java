package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex19 {
	public static void main(String[] args) throws IOException {
		/*
		 * while 구문 프로그램 코드의 특정 부분을 반복하여 수행한다. 조건이 참이면 실행하고 다시 조건을 확인한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("-- 예제1 --");
//		System.out.println();
//		int a = 0;
//
//		while (true) { // 참일경우 진행 계속 진행함.
//			System.out.print("숫자를 입력하세요 : ");
//			x = Integer.parseInt(br.readLine());
//			if (a % 2 == 1) { // 조건에 따라 계속 진행할지 종료할지 결정.
//				System.out.print("홀수를 입력하여 종료됩니다.");
//				break;
//			}
//		}
//		
//		System.out.println("-- 예제2 --");
//		System.out.println();
//
//		int b = 0;
//
//		while (true) {
//			System.out.print("숫자를 입력하세요 : "); 
//			b = Integer.parseInt(br.readLine()); 
//			if (b % 2 == 1) // 입력받은 숫자 홀수 짝수 조건식
//				System.out.println("홀수입니다.");
//			else
//				System.out.println("짝수입니다.");
//			System.out.print("계속 하시겠습니다?(y/n) : ");
//			char ch = (char) System.in.read();
//			System.out.println();
//			System.in.read();
//			System.in.read();
//			if (ch == 'n' || ch == 'N') // n 또는 N이 입력되면 멘트 후 프로그램 종료. 
//				System.out.println("프로그램을 종료합니다.");
//			break;
//		}
//		
//		System.out.println("-- 예제3 --");
//		System.out.println();
//		/*
//		 * do ~ while 구문 
//		 * 반복할 내용을 먼저 실행한 후 조건식을 판단한다.
//		 * 최소 한번은 내용이 실행된다.
//		 */
//		
		int kor1 = 0;
		while (true) {
			System.out.print("국어 점수 입력 : ");
			kor1 = Integer.parseInt(br.readLine());

			if (kor1 <= 100 && kor1 >= 90)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, 등급은 'A'입니다.");
			else if (kor1 < 90 && kor1 >= 80)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, 등급은 'B'입니다.");
			else if (kor1 < 80 && kor1 >= 70)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, 등급은 'C'입니다.");
			else if (kor1 < 70 && kor1 >= 60)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, 등급은 'D'입니다.");
			else if (kor1 < 60 && kor1 >= 50)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, 등급은 'E'입니다.");
			else if (kor1 < 50 && kor1 >= 0)
				System.out.println("입력하신 점수는 " + kor1 + "점 이며, '불합격' 입니다.");
			else if (kor1 > 100 || kor1 < 0)
				System.out.println("1~100점 범위를 벗어났습니다. 다시 입력하세요.");
			
				System.out.print("계속 하시겠습니다?(y/n) : ");
			char ch = (char) System.in.read();
			System.out.println();
			System.in.read();
			System.in.read();
			if (ch == 'n' || ch == 'N') // n 또는 N이 입력되면 멘트 후 프로그램 종료.
				System.out.println("프로그램을 종료합니다.");
			break;

		}
//		
//		//do ~ while 구문 사용
//		int kor2 = 0;
//		
//		do {
//			System.out.print("국어 점수 입력 : ");
//			kor2 = Integer.parseInt(br.readLine());
//		} while ( kor2 > 100 || kor2 <= 0);

	}
}
