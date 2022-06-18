package Chapter02;

public class Ex05 {
	public static void main(String[] args) {

		// boolean의 size는 1byte
		boolean bool = true;
		System.out.println("bool의 값은 : " + bool);
		bool = false;
		System.out.println("bool의 값은 : " + bool);
		

		System.out.println("--");

		// byte의 size는 1byte
		byte by = 127;
		by++;
		System.out.println("byte값 127 + 1 = " + by + "입니다.");
		by--;
		System.out.println("byte값 127 - 1 = " + by + "입니다.");

		System.out.println("--");

		// char의 size는 2byte
		char ch1 = 65;
		char ch2 = 'A';
		char ch3 = '\u0041';
		System.out.println("ch1 =" + ch1 + ", ch2 = " + ch2 + ", ch3 = " + ch3);

	}
}
