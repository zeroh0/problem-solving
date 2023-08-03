package programmers.lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class $모의고사 {

	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		int[] answer = solution(answers);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	public static int[] solution(int[] answers) {
		int[] stu1 = {1, 2, 3, 4, 5};
		int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for (int i = 0; i < answers.length; i++) {
			int answer = answers[loopIndex(answers, i)];

			if (answer == stu1[loopIndex(stu1, i)]) {
				score1++;
			}
			if (answer == stu2[loopIndex(stu2, i)]) {
				score2++;
			}
			if (answer == stu3[loopIndex(stu3, i)]) {
				score3++;
			}
		}

		int[] scores = {score1, score2, score3};
		int max = getMax(scores);

		return IntStream.range(0, scores.length)
				.filter(idx -> scores[idx] == max)
				.map(ord -> ord + 1)
				.toArray();
	}

	private static int loopIndex(int[] answers, int i) {
		return i % answers.length;
	}

	private static int getMax(int[] nums) {
		int max = 0;
		for (int num : nums) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

}
