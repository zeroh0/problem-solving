package programmers.lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class $비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = solution(n, arr1, arr2);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		return IntStream.range(0, n)
				.mapToObj(idx -> replaceBinaryCalculator(toBinaryString(n, arr1[idx]), toBinaryString(n, arr2[idx])))
				.toArray(String[]::new);
	}

	// 1 -> '#', 0 -> ' ' 으로 치환
	private static String replaceBinaryCalculator(String binaryString1, String binaryString2) {
		char[] chars = new char[binaryString1.length()];

		for (int i = 0; i < binaryString1.length(); i++) {
			char bit1 = binaryString1.charAt(i);
			char bit2 = binaryString2.charAt(i);
			// 둘 중 하나가 1이라면 0 아니면 0
			int max = Math.max(Character.getNumericValue(bit1), Character.getNumericValue(bit2));

			if (max == 0) {
				chars[i] = ' ';
			} else {
				chars[i] = '#';
			}
		}

		return new String(chars);
	}

	// 10진수 -> 2진수
	private static String toBinaryString(int n, int num10) {
		String numNStr = "";
		while (num10 > 0) {
			numNStr = num10 % 2 + numNStr;
			num10 /= 2;
		}

		// 길이 동일하게 맞춰주기
		int length = numNStr.length();
		while (length++ < n) {
			StringBuffer sb = new StringBuffer(numNStr);
			sb.insert(0, "0");
			numNStr = sb.toString();
		}

		return numNStr;
	}

}
