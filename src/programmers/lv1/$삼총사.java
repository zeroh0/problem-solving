package programmers.lv1;

public class $삼총사 {

	public static void main(String[] args) {
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		int answer = solution(number);
		System.out.println("answer = " + answer);
	}

	private static int solution(int[] number) {
		int count = 0;

		// 조합(Combination)
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				for (int k = j + 1; k < number.length; k++) {
					int sum = number[i] + number[j] + number[k];
					if (sum == 0) {
						count++;
					}
				}
			}
		}

		return count;
	}

}
