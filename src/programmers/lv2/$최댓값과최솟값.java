package programmers.lv2;

import java.util.Arrays;

public class $최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String answer = solution(s);
		System.out.println("answer = " + answer);
	}

	public static String solution(String s) {
		int[] numbers = Arrays.stream(s.split("\\s")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(numbers);

		int min = numbers[0];
		int max = numbers[numbers.length - 1];

		return String.format("%d %d", min, max);
	}

}
