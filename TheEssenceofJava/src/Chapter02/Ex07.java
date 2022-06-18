package Chapter02;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {

		System.err.println("표준 에러 출력 스트림 . . . ");
		int x = System.in.read();
		System.out.println("x = " + x);
		System.out.println("표준 출력 스트림 ...");

	}
}
