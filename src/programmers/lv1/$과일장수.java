package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class $과일장수 {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] scores = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		int answer = solution(k, m, scores);
		System.out.println("answer = " + answer);
	}

	public static int solution(int k, int m, int[] scores) {
		int box = scores.length / m;

		List<Integer> scoreList = Arrays.stream(scores).boxed().collect(Collectors.toList());
		Collections.sort(scoreList, Comparator.reverseOrder());

		int amount = 0;
		for (int i = 0; i < box; i++) {
			int skip = i * m;
			int min = 10;
			for (int j = 0; j < m; j++) {
				int score = scoreList.get(skip + j);
				// 해당 박스에서 최소값을 구한다.
				if (score < min) {
					min = score;
				}
			}
			amount += min * m;
		}

		return amount;
	}

}
