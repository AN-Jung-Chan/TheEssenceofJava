package Chapter02;

import java.io.*;

public class Ex18 {
	public static void main(String[] args) throws IOException {

		/*
		 * 예제 - 별 출력하기 다양한 별모양 출력하기
		 */

		int star = 5;

		System.out.println("-- 예제1 --");
		/*
		 * 12345
		 */
		
//		int sum = 0;
		for (int i = 1; i <= star; i += 1) {
//			sum += 1;
//			System.out.print(sum);
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-- 예제 2 -- ");
		/*
		 *	*
		 *	*
		 *	*
		 *	*
		 *	*
		 */
		
		for (int i = 1; i <= star; i++) {
			System.out.println("*");
		}

		System.out.println();
		System.out.println("-- 예제 3-- ");
		/*
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 */

		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 4 -- ");
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 5 -- ");
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 6 -- ");
		/*
		 * 12345
		 * 23456
		 * 34567
		 * 45678
		 * 56789
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j <= i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 7 -- ");
		/*
		 * 56789
		 * 45678
		 * 34567
		 * 23456
		 * 12345
		 */

		for (int i = 6; i >= 2; i--) {
			for (int j = i - 1; j <= i + 3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-- 예제 8 -- ");
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 9 -- ");
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 10 -- ");
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		
		for(int i = 0; i < 5; i++) {  // 5줄 행
			for (int j = 0; j < i; j++) { // 띄어쓰기 i
				System.out.print(" ");
			}
			
			for(int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 11 -- ");
		/*
		 *     *
		 *    ** 
		 *   *** 
		 *  ****     
		 * *****      
		 */
		
		for(int i = 1; i < 6; i++) {  // 5줄 행
			for (int j = 5; j > i; j--) { // 띄어쓰기 
				System.out.print(" ");
			}
			
			for(int k = 1; k < i+1; k++) { // 별 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 12 -- ");
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 1; k <= 4; k++) {
			for (int l = 4; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// 풀어서

		for (int i = 1; i <= 5; i++) {

			// 별
			for (int j = 1; j <= i; j++) {	// i=1번째 * 1개부터 i=5번째까지 하나씩 늘려서 *찍기
				System.out.print("*");
			}

			// 스페이스
			for (int j = 5; j >= i; j--) {	// i=1번째 띄어쓰기 5개부터 i=5번째까지 하나씩 줄려서 띄어쓰기 찍기
				System.out.print(" ");
			}

			System.out.println();
		}

		for (int k = 1; k <= 4; k++) {

			// 별
			for (int l = 4; l >= k; l--) {	// k=1번째 * 4개부터 k=5번째까지 하나씩 줄여서 *찍기
				System.out.print("*");
			}

			// 스페이스
			for (int l = 1; l <= k; l++) {	// k=1번째 띄어쓰기 1개부터 k=5번째까지 하나씩 늘려서 띄어쓰기 찍기
				System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 13 -- ");
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */

		// 줄어드는 *
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 늘어나는 *
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 14 -- ");
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * ***** 
		 */
		
		for (int i = 0; i < 5; i++) {
			// 띄어쓰기
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// 별
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			// 띄어쓰기
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			// 별
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-- 예제 15 -- ");
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for (int i = 1; i <= 5; i++) {
			// 띄우기
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			// 별
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			// 띄어쓰기
			for (int j = 0; j < i+1; j++) {	// j < i; 
				System.out.print(" ");
			}

			// 별
			for (int j = 4; j > i; j--) {	// j > i-1; 해도 같은 결과
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 16 -- ");
		/*
		 * 	   *
		 * 	  ***
		 * 	 *****	
		 * 	*******
		 * *********
		 */
		
		for (int i = 1; i <= 5; i++) {
			// 띄어쓰기
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			// 별
			for (int j = 1; j <= i*2-1; j++) {
					System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 17 -- ");
		/*
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		for (int i = 1; i <= 5; i++) {
			// 띄어쓰기
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// 별
			for (int j = i; j <= 2*5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println();
		System.out.println("-- 예제 18 -- ");
		/*
		 *     *
		 *    *** 
		 *   ***** 
		 *  ******* 
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		for(int i = 1; i <= 5; i++) {
			// 줄어드는 띄어쓰기
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// 별
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 4; i++) {
			// 늘어다는 띄어쓰기
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}			
			
			// 별
			for (int j = 8; j > i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-- 예제 19 -- ");
		/*
		 * ***** *****
		 * ****   ****
		 * ***     ***
		 * **       **
		 * *         *
		 * **       **
		 * ***     ***
		 * ****   ****
		 * ***** *****
		 */
		
		//위
		for (int i = 1; i <= 5; i++) {
			// 줄어드는 별
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			
			// 늘어나는 띄어쓰기
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print(" ");
			}
			
			// 줄어드는 별
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아래 
		for (int i = 1; i <= 4 ; i++) {
			// 늘어나는 별
			for (int j = 1; j <= i+1 ; j++) {
				System.out.print("*");
			}
			
			// 줄어드는 띄어쓰기
			for (int j = 8; j > i*2-1; j--) {
				System.out.print(" ");
			}
			
			// 늘어나는 별
			for (int j = 1; j <= i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-- 예제 20 -- ");
		/*
		 * *         *
		 * **       **
		 * ***     ***
		 * ****   ****
		 * ***** *****
		 * ****   ****
		 * ***     ***
		 * **       **
		 * *         *
		 */

		for (int i = 1; i <= 5; i++) {
			// 늘어나는 별
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// 줄어드는 공백
			for (int j = 10; j > i * 2 - 1; j--) {
				System.out.print(" ");
			}

			// 늘어나는 별
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			// 줄어드는 별
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			
			// 늘어나는 공백
			for (int j = 1; j <= i*2+1; j++) {
				System.out.print(" ");
			}
			
			// 줄어드는 별
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}			
			System.out.println();
		}

		System.out.println();
		System.out.println("-- 예제 21 -- ");
		/*
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
		for (int i = 1; i <= 5; i++) {
			// 늘어나는 공백
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// 줄어드는 별
			for (int j = 10; j > i * 2 - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			// 줄어드는 공백
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			// 늘어나는 별
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
