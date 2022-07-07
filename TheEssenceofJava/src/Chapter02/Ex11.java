package Chapter02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) throws IOException {
		// 삼항연산자 : 조건항? 항1 : 항2
		// 조건항이 true면 항1을 실행하고 조건항이 false면 항2를 실행한다.

		// 예제1 삼항연산자를 if문으로 풀어서 설명
		String grade1 = "";
		int math1 = 70;
		if (math1 >= 90) {
			grade1 = "pass";
		} else {
			grade1 = "fail";
		}
		System.out.println(math1 + "는 " + grade1);
		System.out.println();

		// 예제1을 삼항연산자로 할 시 - 변수 = (조건) ? 참 : 거짓; <<<< 꼭 기억!!
		int math2 = 70;
		String grade2 = (math2 >= 90) ? "pass" : "fail";
		System.out.println(math2 + "는 " + grade2);

		System.out.println();

		// BufferedReader 를 이용하여 값을 입력받아 출력하는 예제
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("선택하시오.");
		System.out.print("1.남자 2.여자 = ");
		int x = Integer.parseInt(in.readLine());
		String str = x == 1 ? "남성" : "여성";
		System.out.println("str = " + str);

		System.out.println();

		System.out.println("-- 배정 연산자 --");

		byte a = 10;

//		a = a + 10; // 인 경우에는 int 형데이터로 변환되므로 배정대입 연산자를 사용한다. 에러난다는 말.
		a += 10;
		System.out.println("a = " + a);

	}
}
