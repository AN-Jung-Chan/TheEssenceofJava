package Chapter02;

import java.io.IOException;

public class Ex15 {
	public static void main(String[] args) throws IOException {

//		/*  for 구문
//		 *  유사하거나 동일한 동작을 지정한 횟수만큼 반복할 때 사용
//		 *  배열이나 컬렉션을 다룰 때 while문과 함께 사용함
//		 */
//		
//		/*	for (초기값; 조건식; 증감식 )
//		 *	초기값 - 루프를 위한 변수의 초기화를 하는 부분.
//		 *	조건식 - 루프를 위한 조건식(논리형 경과)이 들어가는 부분.
//		 *	증감식 - 루프를 위한 변수의 증가 or 감소 되는 식이 들어간다.
//		 *	**각 부분은 공백으로 둘 수 있으며, 공백을 사용할 경우 루프가 제대로 동작하도록 주의 해야 한다.
//		 */
//		
		System.out.println("--예제1--");

		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			sum1 += i + 1; // sum1 = sum1 + i + 1 / 0~9까지 다 더할때마다 +1 해준것.
		}
		System.out.println("sum1 = " + sum1); // 실행결과 : sum = 55

		System.out.println();
		System.out.println("--예제2--");

		int sum2 = 0;
		for (int i = 10; i > 0; --i) {
			sum2 += i; // 10 ~ 1까지 1씩 뺀 수를 더해라 sum2 = 55
		}
		System.out.println("sum2 = " + sum2);

		System.out.println();
		System.out.println("--예제3--");

		int sum3 = 0;
		for (int i = 1; i < 10; i += 2) {
			sum3 += i; // 1 ~ 9까지 2씩 증가한 숫자를 더해라 sum3 = 25
		}
		System.out.println("sum3 = " + sum3);

		System.out.println();
		System.out.println("--예제4--");

		int sum4 = 0;
		for (int i = 1; i < 10;) {
			if (i % 2 == 1)
				sum4 += i; // 1 ~ 9까지 숫자 중 2로나누어 몫이 1인 수를 더해라 sum4 = 25 
			i++;
		}
		System.out.println("sum4 = " + sum4);

	}
}
