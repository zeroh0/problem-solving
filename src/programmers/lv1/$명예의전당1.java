package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class $명예의전당1 {

	public static void main(String[] args) {
		int k = 4;
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int[] answer = solution(k, score);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];

		List<Integer> scoreList = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
				scoreList.add(score[i]);

				int min = scoreList.stream()
						.sorted(Comparator.reverseOrder())
						.limit(k)
						.mapToInt(num -> num)
						.min()
						.getAsInt();

				answer[i] = min;
		}

		return answer;
	}

}
