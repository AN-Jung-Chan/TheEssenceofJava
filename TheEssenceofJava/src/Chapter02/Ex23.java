package Chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex23 {
	public static void main(String[] args) throws IOException {
		/* 배열
		 * 1차원 배열 선언(배열 참조 변수)
		 * int[] arr; //참조변수
		 * int arr[]; //참조변수
		 * arr = new int[4];
		 * 배열은 new를 통해 생성(new 연산자는 동적 할당 가능)
		 * java의 Garbege Collector가 Garbege Collection Heap메모리에 할당
		 * G.C가 자동 초기화한다.
		 */
		
		System.out.println("-- 예제 1 --");
		int[] arr1 = {1, 2, 3}; //선언 시만 사용		arr1 ㅡ> 1 2 3
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		int[] arr2, arr3;		// 				arr2 ㅡ> arr3 ㅡ>
		arr2 = new int[3];		// heap에 할당		arr2 ㅡ> 0 0 0
		arr2[0]	= 4;			//				arr2 ㅡ> 4 0 0
		arr2[1]	= 5;			//				arr2 ㅡ> 4 5 0
		arr2[2]	= 6;			//				arr2 ㅡ> 4 5 6
		arr3 = new int[] {7, 8, 9}; //heap에 할당 및 초기화 	arr3 ㅡ> 7 8 9

		System.out.println();
		System.out.println("-- 예제 2 --");

		char[] str = { 'a', 'b', 'c' }; // 배열생성 및 초기화
		
		System.out.println("str[0] : " + str[0]);
		System.out.println("str[1] : " + str[1]);
		System.out.println("str[2] : " + str[2]);
		
		System.out.println();
		System.out.println("-- 예제 3 --");

		int[] arr; // 배열참조변수 생성
		arr = new int[] { 10, 20, 30, 40 }; // 배열 생성 및 초기화

		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		
		System.out.println();
		System.out.println("-- 예제 4 --");
		// for문 이용하기
		int[] array;
		array = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = i + 1; // 배열 요소에 값 대입
		}

		for (int i = 0; i < array.length; i++) { // array.length == 5
			System.out.println("arr[" + i + "] : " + array[i]);
		}
		
		System.out.println();
		System.out.println("-- 예제4 foreach형식 --");
		/* 아래의 for문은 타 언어에서 foreach라고도 불리는 형식이다.
		 * arr에 있는 요소를 순회하며 하나의 값을 앞의 변수에 담고 값이 있으면 종속문장을 실행한다.
		 * 즉, arr의 요소의 개수만큼 for문을 반복 시킬 수 있음.
		 * 
		 */
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int j = 0;
		for (int a : array1) {
			System.out.println("array1[" + j + "] : " + a);
			j++;
		}

		System.out.println();
		System.out.println("-- 예제문제 성적구현 --");
		/*
		 * int[] st = new int[4] 배열을 만들어
		 * 국어, 영어, 수학, 총점, 평균을 구하는 프로그램을 만드시오.
		 * 필요한 것이 있다면 자유롭게 추가(평균 값을 위한 실수형 변수 등)
		 * ex)
		 * 		국어점수 : 110 < 잘못 입력 시 다시 입력가능
		 * 		국어점수 : 100
		 * 		영어점수 : 90
		 * 		수학점수 : 3
		 * 		총점 : 193
		 * 		평균 : 64.333336
		 */
//
//		// **참조한 프로그램**
//		// 입력 : 이름, 국어점수, 영어점수, 수학점수
//		// 연산 : 3과목 총점, 평균
//		// 출력 : 이름, 국어점수, 영어점수, 수학점수, 3과목 총점, 평균,
//
//		String name; // 이름 변수
//		int[] score; // 성적 변수
//		float avg; // 평균 변수
//
//		// 메모리 할당
//		score = new int[4];
//
//		// 입력 구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while (true) {
//			System.out.print("이름 : ");
//			name = br.readLine(); // 이름 받기
//
//			System.out.println("국어, 영어, 수학 점수를 차례대로 입력하시오 .");
//
//			for (int i = 0; i < score.length - 1; i++) { // score.length-1 하는 이유는 [3]은 총점이기때문.
//				score[i] = Integer.parseInt(br.readLine()); // 성적입력받기
//				score[3] += score[i]; // score[0], [1], [2] 의 합을 score[3]에 대입
//			}
//
//			avg = score[3] / 3.f; // 총점 나누기 과목수 3 해서 평균 산출
//
//			// 출력 구현
//			System.out.println();
//			System.out.println("이름 : " + name);
//
//			String[] str = { "국어 점수 ", "영어 점수 ", "수학 점수 " };
//
//			for (int i = 0; i < str.length; i++) {
//				System.out.println(str[i] + " : " + score[i]);
//
//			}
//			System.out.println("평균 점수 : " + avg);
//			System.out.println();
//		}

		/*
		 * 내가 만든 프로그램 
		 * 입력 : 이름, 국어점수, 영어점수, 수학점수 
		 * 연산 : 3과목 총점, 평균 
		 * 출력 : 이름, 국어점수, 영어점수, 수학점수, 3과목 총점, 평균,
		 */

		// 변수
		String name; // 이름 변수
		String[] sub = { "국어", "영어", "수학" }; // 과목 변수
		int[] score = new int[3]; // 점수 변수
		int total = 0;
		float avg = 0;

		// 입력 및 연산
		while (true) {
			System.out.print("학생 이름 : "); // 학생이름 받기
			name = br.readLine();

			for (int i = 0; j < score.length; j++) {
				System.out.print(sub[i] + " 점수 : "); // sub[i] 국어, 영어, 수학 점수 입력
				score[i] = Integer.parseInt(br.readLine()); // 입력받은 점수를 score[0], score[1], score[2] 에 반영
				total += score[i];
			}
			avg = total / 3.f;

			// 출력
			System.out.println("----출력물----");
			System.out.println("학생 이름 : " + name);
			System.out.println("총      점 : " + total);
			System.out.println("평균 점수 : " + avg);
			System.out.println();
		}
	}
}
