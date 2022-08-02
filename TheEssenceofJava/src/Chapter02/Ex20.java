package Chapter02;

import java.io.IOException;

public class Ex20 {
	public static void main(String[] args) throws IOException {
		/*
		 * break; 
		 * switch ~ case, for, while, do ~ while 등의 반복문에서 하나만 종료
		 * 
		 * continue; 
		 * for, while, do ~ while 등의 반복문에서 조건을 확인하는 맨 처음으로 이동
		 * 즉, 해당 조건 실행한하고 다음걸 실행
		 */
		System.out.println("-- 예제 1 --");
		for (int i = 0; i <= 10; i++) {	// 증감식을 실행하고 조건을 확인하는 동작으로 이어지는 것.
			if (i % 2 == 0) continue;	// i값이 짝수라면 continue 동작이 된다. 그러면 현재 나머지 코드는 건너뛴다.
			System.out.println("i = " + i); // i값 출력
		}
		
		System.out.println();
		System.out.println("-- 예제 2 --");
		/*
		 * 제어문 앞에 :(콜론) 으로 별칭을 붙여 해당하는 범위에서 break, continue 할 수 있다. 
		 */
		AAA: for (int i = 0; i < 3; i++) {
			BBB: for (int j = 0; j < 3; j++) {
				System.out.print("*");
				// 주석처리된 break문과 continue문 하나씩 주석 해제해서 확인하면 이해하기 편함
//				continue AAA;     // AAA이름의 제어문으로 continue;
//				break;		  	  // 현재 제어문 break; break AAA와 같음.
//				break AAA;	  	  // AAA이름의 제어문을 break;	  	
//				continue BBB;	  // BBB제어문으로 continue; continue와 같음.
//				continue;		  // 현재 제어문으로 continue; continue BBB와 같음.
			}
			System.out.println();
		}

	
	
	
	
	
	
	
	
	}
}
