package Chapter02;

//자바의정석 : 사칙연산 계산하기
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(3+5);
		System.out.println(5+3);	//덧셈은 큰숫자, 작은숫자 상관 x
		System.out.println(5-3);
		System.out.println(3-5);	//뺄셈은 숫자 그대로 계산
		System.out.println(3*5);	//곱셈은 큰숫자, 작은숫자 상관 x
		System.out.println(5/3);
		System.out.println(3/5);
		System.out.println(2/254);	//나눗셈은 작은수에서 큰수 나누면 무조건 0
	}
}
