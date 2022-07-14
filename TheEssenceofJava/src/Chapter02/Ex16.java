package Chapter02;

public class Ex16 {
	public static void main(String[] args) {
		
		/*	중첩 for 구문
		 *	for문 안에 for문을 사용하는 형식 
		 *	바깥for문은 외부반복(행,세로), 안쪽for문은 내부반복(열,가로)이다.
		 */
		
		System.out.println("--예제--");
		
		int sum = 0;
		for (int i = 0; i < 10; i++) { // 외부반복, 행, 세로
			for ( int j = 0; j < 10; j++) { // 내부반복, 열, 가로
				sum += 1;	
				System.out.print(sum + " / ");
			}
			System.out.println();
		}
		
		System.out.println("sum = " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
