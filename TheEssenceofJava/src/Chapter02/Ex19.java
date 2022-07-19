package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex19 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("안녕");
		String re = br.readLine();
		System.out.println(re);
	}
}
