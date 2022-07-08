package Chapter02;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("-- 예제 1 --");
		// 예제1 - 문자를 입력받아 그대로 출력하는 프로그램.

		System.out.print("아무 글이나 입력하면 그대로 출력해줌 : ");
		String str = br.readLine();
		System.out.println("입력한 글은 : " + str);

		System.out.println("-- 예제 2 --");
		// 예제2 - 값을 받아들여 60점 이상이면 합격 60점 미만이면 불합격이라는 글자를 출력하는 프로그램을 만드시오.

		System.out.println("점수를 입력하여 합격 여부를 확인하시오.(단, 정수만 입력)");
		System.out.println("점수입력 : ");

		int score = Integer.parseInt(br.readLine());

		// 삼항연산자 활용
		String result = (score >= 60) ? "합격!" : "불합격!";
		System.out.println("결과는 " + result);

		// if문 활용
//		if (score >= 60)
//			System.out.println("결과는 합격!");
//		else
//			System.out.println("결과는 불합격!");

		System.out.println("-- 예제 3 --");
		//예제3 - 산술연산자중 하나를 입력받아 맞는지 아닌지 확인하는 프로그램을 만드시오.

//		char ch;
//		boolean bool;

		System.out.println("산술연산자(+, -, *, /, %) 중 하나를 입력하시오.");

		char ch = (char) System.in.read();
		boolean bool = (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '%') ? false : true;

		if (bool)
			System.out.println(ch + "는 산술연산자 입니다.");
		else
			System.out.println(ch + "는 산술연산자가 아닙니다.");

	}
}
