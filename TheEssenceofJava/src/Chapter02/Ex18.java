package Chapter02;

public class Ex18 {
	public static void main(String[] args) {

		/*
		 * 예제 - 별 출력하기 다양한 별모양 출력하기
		 */

//		int star = 5;
//
//		System.out.println("-- 예제1 --");
//		/*
//		 * 12345
//		 */
//		
////		int sum = 0;
//		for (int i = 1; i <= star; i += 1) {
////			sum += 1;
////			System.out.print(sum);
//			System.out.print(i);
//		}
//		
//		System.out.println();
//		System.out.println("-- 예제 2 -- ");
//		/*
//		 *	*
//		 *	*
//		 *	*
//		 *	*
//		 *	*
//		 */
//		
//		for (int i = 1; i <= star; i++) {
//			System.out.println("*");
//		}
//
//		System.out.println();
//		System.out.println("-- 예제 3-- ");
//		/*
//		 * 	*****
//		 * 	*****
//		 * 	*****
//		 * 	*****
//		 * 	*****
//		 */
//
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j <5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println("-- 예제 4 -- ");
//		/*
//		 * 11111
//		 * 22222
//		 * 33333
//		 * 44444
//		 * 55555
//		 */
//		
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j <5; j++) {
//				System.out.print(i+1);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println("-- 예제 5 -- ");
//		/*
//		 * 12345
//		 * 12345
//		 * 12345
//		 * 12345
//		 * 12345
//		 */
//		
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j <5; j++) {
//				System.out.print(j+1);
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//		System.out.println("-- 예제 6 -- ");
//		/*
//		 * 12345
//		 * 23456
//		 * 34567
//		 * 45678
//		 * 56789
//		 */
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = i + 1; j <= i + 5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
		System.out.println();
		System.out.println("-- 예제 7 -- ");
//		/*
//		 * 56789
//		 * 45678
//		 * 34567
//		 * 23456
//		 * 12345
//		 */

		for (int i = 6; i >= 2; i--) {
			for (int j = i - 1; j <= i + 3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println();
//		System.out.println("-- 예제 6 -- ");

	}
}
