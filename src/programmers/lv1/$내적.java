package programmers.lv1;

import java.util.stream.IntStream;

public class $내적 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {-3, -1, 0, 2};
		int answer = solution(a, b);
		System.out.println("answer = " + answer);
	}

	private static int solution(int[] a, int[] b) {
		return IntStream.range(0, a.length)
				.map(i -> a[i] * b[i])
				.sum();
	}

}
