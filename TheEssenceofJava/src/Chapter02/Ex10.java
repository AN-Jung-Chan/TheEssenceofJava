package Chapter02;

//연산자 쉽게 이해하기! 사용하는거 위주
public class Ex10 {
	public static void main(String[] args) {

		System.out.println("-- 부호 연산자 --");	
		// 부호연산자 ++ : 값 1증가 , -- : 값 1감소
		// i++ 값이 참조된 후에 증가
		// ++i 값이 참조되기 전에 증가
		
		int i = 0;
		int j = 10;
		i++;
		j--;

		System.out.println(i);
		System.out.println(j);
		
		int k = 0;
		int l = 0;
		
		System.out.println(++k);
		System.out.println(l++);
		System.out.println(l);

		System.out.println("-- 단항 연산자 --");
		// ! 논리부정 - 내용의 반대되는 값을 표현, boolean에서만 사용가능
		boolean bool1 = false;
		System.out.println("a = " + bool1);
		System.out.println("b = " + !bool1);

		boolean bool2 = 5 > 3;
		System.out.println("c = " + bool2);
		System.out.println("d = " + !(5 > 3));

		System.out.println("-- 관계 연산자 -- ");
		// ==는 비교하는 두 개의 피연산자가 같으면 true, 아니면 false
		// !=는 비교하는 두 개의 피연산자가 같으면 false, 아니면 ture

		boolean bool3 = 5 < 3; // false
		boolean bool4 = 10 != 10; // false
		System.out.println("bool3 = " + bool3);
		System.out.println("bool4 = " + bool4);

		boolean a = bool3 != bool4;
		boolean b = bool3 =! bool4; // =! 는 뒤의 연산자를 부정한 후 대입하하는 뜻이기에 결과값이 true 이다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("-- 논리 연산자 -- ");
		// && : and연산자, 피연산자를 비교하여 둘 다 참이면 true 아니면 false
		// || : or연산자, 피연산자를 비교하여 둘 중 하나면 참이면 true, 아니면 false

		boolean bool5 = 5 < 3 && 7 > 4; // false && true = false
		boolean bool6 = 10 != 11 || 7 <= 4; // true || false = ture
		System.out.println("bool5 = " + bool5);
		System.out.println("bool6 = " + bool6);

	}
}
