package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex22 {
	/*
	 * 숫자를 입력 받아 연산하는 계산기 프로그램
	 */

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int sub(int a, int b) {
		int sum = a - b;
		return sum;
	}

	public static int mul(int a, int b) {
		int sum = a * b;
		return sum;
	}

	public static int div(int a, int b) {
		int sum = a / b;
		return sum;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("첫번째 정수 입력 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("두번째 정수 입력 : ");
			int b = Integer.parseInt(br.readLine());

			System.out.print("연산자 입력(1.더하기 2.빼기 3.곱하기 4.나누기) : ");
			int su = Integer.parseInt(br.readLine());

			switch (su) {
			case 1:
				int ret1 = add(a, b);
				System.out.println("더하기 결과 : " + ret1);
				break;
			case 2:
				int ret2 = sub(a, b);
				System.out.println("빼기 결과 : " + ret2);
				break;
			case 3:
				int ret3 = mul(a, b);
				System.out.println("곱하기 결과 : " + ret3);
				break;
			case 4:
				int ret4 = div(a, b);
				System.out.println("나누기 결과 : " + ret4);
				break;
			}
			System.out.println();
		}

	}
}
