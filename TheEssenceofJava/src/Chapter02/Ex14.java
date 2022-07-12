package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14 {
	public static void main(String[] args) throws IOException {

		/* SWITCH ~ CASE 구문
		 * switch : 바꾸다 / case : 상황, 경우
		 * 조건에 들어온 값에 따라 case 상수에 매치되는 줄부터 실행시키는 제어문(흐름 분기)  
		 * 
		 * 옵션구문
		 * break : 현재 실행중인 switch 영역을 나가서 다음 문장을 실행하도록 한다.
		 * default : 조건에 들어온 값에 해당하는 case가 없을 때 찾는 case (if문의 else 같은..?)
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 하나를 입력하시오 : ");
		int a = Integer.parseInt(br.readLine());

		switch (a) {	// 입력된 숫자 조건이 반영
		case 1:			// 같은 숫자가 나오면  
			System.out.println("1입력");	// 해당 코드 실행
			break;		//실행 완료 후 프로그램 종료.
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default:
			System.out.println("1, 2, 3 이외의 숫자 입력함");
		}
		
		/* 예제 - 예제 주민등록번호의 7번째 자리 수를 이용하여 출생년도를 파악하시오
		 * -break의 사용은 필수가 아니라는 것을 이해하기 위한 예제이다.-
		 */

		System.out.print("주민등록번호 7번째 자리 수 입력 : ");

		int num = Integer.parseInt(br.readLine());
		int year = 0;

		switch (num) {
		case 9:
			year = 1800;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		case 0:
			year = 1800;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		case 1:
			year = 1900;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		case 2:
			year = 1900;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		case 3:
			year = 2000;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		case 4:
			year = 2000;
			System.out.println("입력하신 " + num + "번은 " + year + "년대 입니다.");
			break;
		default:
			System.out.println("입력하신 숫자 " + num + "번은 존재하지 않습니다.");
			break;
		}

		/* 
		 * 보통 switch 구문은 단순한 값으로 실행흐름 분기를 하려는 경우 사용된다.
		 * 예제 문제 - switch를 활용하여 성적관리 프로그램 만들기.
		 * 1. 학생등록(이름) 2. 국어, 영어, 수학 점수 입력  3. 학생 이름 출력
		 * 4. 총점 출력  5. 평균 출력  6. 종 료
		 * 배열을 활용하여 완성해보기! 배열 공부 ㄲ
		 */

	}
}
