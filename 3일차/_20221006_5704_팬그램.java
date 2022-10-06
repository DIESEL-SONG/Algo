package _1주차;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _20221006_5704_팬그램 {
	public static void main(String[] args) {
		// 영어소문자갯수만큼 배열만들기
		// 문장을 입력받아서 공백제거
		// 문장의 길이만큼 반복문을 돌면서 char로 변환하고 97을 빼준다음
		// 해당하는 숫자별로 배열에 count++
		// 다음 alpha 배열을 돌면서 
		// 하나라도 0이면 N
		// 전부다 1이상이면 Y

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 배열만들기
			int[] alpha = new int[26];
			String str = sc.nextLine().replace(" ", "");

			// *이 들어오면 break
			if (str.equals("*"))
				break;

			for (int i = 0; i < str.length(); i++) {
				alpha[str.charAt(i)-97]++;
			}

			String result = "Y";
			for (int i = 0; i < 26; i++) {
				if (alpha[i] == 0) {
					result = "N";
					break;
				}
			}
			
			System.out.println(result);
		}
	}
}
