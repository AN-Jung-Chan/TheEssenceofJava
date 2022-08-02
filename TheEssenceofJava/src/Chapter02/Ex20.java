package Chapter02;

public class Ex20 {
	public static void main(String[] args) {

		/*
		 * break; 
		 * switch ~ case, for, while, do ~ while 등의 반복문에서 하나만 종료
		 * 
		 * continue; 
		 * for, while, do ~ while 등의 반복문에서 조건을 확인하는 맨 처음으로 이동
		 * 즉, 해당 조건 실행한하고 다음걸 실행
		 */
		for (int i = 0; i <= 10; i++) {	// 증감식을 실행하고 조건을 확인하는 동작으로 이어지는 것.
			if (i % 2 == 0) continue;	// i값이 짝수라면 continue 동작이 된다. 그러면 현재 나머지 코드는 건너뛴다.
			System.out.println("i = " + i); // i값 출력
		}

	}
}
