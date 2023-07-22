package programmers.lv1;

import java.util.stream.LongStream;

public class $부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long answer = solution(3, 20, 4);
		System.out.println("answer = " + answer);
	}

	private static long solution(int price, int money, int count) {
		// count번 이용할 경우 금액
		long usage = LongStream.rangeClosed(1, count)
				.map(cnt -> cnt * price)
				.sum();

		// count번 이용할 경우 금액 - 가지고 있는 금액 -> 부족한 금액
		return Math.max(usage - money, 0);
	}

}
