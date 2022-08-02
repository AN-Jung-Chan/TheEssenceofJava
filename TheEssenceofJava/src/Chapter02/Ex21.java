package Chapter02;

import java.io.IOException;

public class Ex21 {
//	/* 메서드 형식 
//	 * 접근제한자 [지정예약어] *반환자료형 *메서드명 *(매개변수들) [throws 예외클래스들] 
//	 * { 
//	 * 내용; 
//	 * 내용; 
//	 * ... 
//	 * 내용;
//	 * return // 필요시 사용 }
//	 */

	public static void main(String[] args) throws IOException {

		int ret1 = add(10, 5);
		int ret2 = sub(10, 5);
		int ret3 = mul(10, 5);
		int ret4 = div(10, 5);

		System.out.println("add : " + ret1);
		System.out.println("sub : " + ret2);
		System.out.println("mul : " + ret3);
		System.out.println("div : " + ret4);

	}

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

	/*
	 * 코드 설명 - 위 예제를 실행하면 다음과 같은 절차로 실행된다. **순서가 바뀌어도 코드 실행에 문제가 없다. 편한대로 하면된다. 
	 * 1. main 메서드 실행 
	 * 2. 1과 2값을 add메서드의 매개변수에 복사하며 호출 
	 * 3. add메서드 실행 
	 * 4. 매개변수 a와 b값을 더해서 sum에 대입 
	 * 5. sum의 값을 호출했던 곳으로 돌려주고(return) add메서드 종료 
	 * 6. add메서드로부터 반환 받은 sum의 값을 ret변수에 대입 
	 * 7. System.out.println으로 결과 ret변수의 값을 출력
	 */

}
