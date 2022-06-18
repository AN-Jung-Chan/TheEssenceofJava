package Chapter02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("정수입력 : ");
		String str1 = br.readLine();
		int val1 = Integer.parseInt(str1);
		System.out.println("입력받은 정수 : " + val1);

		System.out.println();

		System.out.print("실수입력 : ");
		String str2 = br.readLine();
		float val2 = Float.parseFloat(str2);
		System.out.println("입력받은 실수 : " + val2);
	}
}
