package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex24 {
	public static void main(String[] args) throws IOException {

		/*
		 * 배열 길이 지정 받고, 무작위의 정수를 입력받아 정렬해서 출력하기.
		 * 입력 : 배열길이, 정수 
		 * 연산 : 배열길이, 그만큼의 길이, 정렬하기
		 * 출력 : 입력한 배열 길이, 입력값 순서대로, 정렬해서 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 생성할 배열의 길이가 필요하며, leng[] 안에 원하는 길이만큼 입력받는다.
		System.out.print("생성할 배열의 길이를 입력하시오 : ");
		int[] leng = new int[Integer.parseInt(br.readLine())];

		int[] su = new int[leng.length]; // 입력한 숫자가 들어가는 변수
		int rank = 0; // 입력 값 정렬을 위한 변수

		// 입력
		for (int i = 0; i < leng.length; i++) {
			System.out.print(i + 1 + "번째 값 입력 : ");
			// leng[i] 만큼 숫자 입력 받기
			su[i] = Integer.parseInt(br.readLine());

		}

		// 입력 값 출력
		System.out.print("배열에 입력한 값은 : ");
		for (int i = 0; i < leng.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.print(" 입니다.");

		// 버블 정렬을 적용한 등수 연산
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (su[i] < su[j]) {
					rank = su[i];
					su[i] = su[j];
					su[j] = rank;
				}
			}
		}

		// 정렬 후 출력
		System.out.println();
		System.out.print("정렬 후 값은 :  ");
		for (int i = 0; i < leng.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.print(" 입니다.");

	}
}
