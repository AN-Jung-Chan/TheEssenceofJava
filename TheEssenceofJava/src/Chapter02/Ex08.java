package Chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열입력 : ");
		String str = br.readLine();
		System.out.println("입력한 문자열 : " + str);

	}
}
