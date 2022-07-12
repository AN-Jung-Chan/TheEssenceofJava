package Chapter02;

public class Ex17 {
	public static void main(String[] args) {
		// for문을 활용한 구구단 출력 프로그램

		int dan = 9;
		
		System.out.println("- 세로 구구단을 출력해보자! -");
		/*
		 * 2*1=2 
		 * 2*2=4  
		 *	 •
		 *	 •
		 *	 •
		 *
		 * 9*9=81 
		 */

		for (int i = 2; i <= dan; i++) {
			System.out.println(i + "단!");
			for (int j = 1; j <= dan; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("\t");
		}
		
		System.out.println();
		
		System.out.println("- 가로 구구단을 출력해보자! -");
		/*
		 * 2*1=2  3*1=3  ••• 9*1=9
		 * 2*2=4  3*2=6  ••• 9*2=18
		 *			 •
		 *			 •
		 *			 •
		 * 2*9=18 3*9=27 ••• 9*9=81
		 */
		for (int n1 = 1; n1 <= dan; n1++) {
			for(int n2 = 2; n2 <= dan; n2++) {
				System.out.print(n2 + "*" + n1 + "=" + (n2*n1));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}
}
