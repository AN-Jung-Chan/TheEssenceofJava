package Chapter02;
//연산자 쉽게 이해하기!
public class Ex10 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 10;
		i++;
		j--;
		
		System.out.println(i);
		System.out.println(j);
		// 부호연산자 ++ : 값 1증가 , -- : 값 1감소 
		// i++ 값이 참조된 후에 증가
		// ++i 값이 참조되기 전에 증가
		int k = 0;
		int l = 0;
		System.out.println(++k);
		System.out.println(l++);
		System.out.println(l);
		
		System.out.println("-------------------------------------");
		// ! 논리부정 - 내용의 반대되는 값을 표현, boolean에서만 사용가능
		boolean bool1 = false;
		System.out.println("a = " + bool1);
		System.out.println("b = " + !bool1);
		
		boolean bool2 = 5 > 3;
		System.out.println("c = " + bool2);
		System.out.println("d = " + !(5 > 3));
		
		
	}
}
