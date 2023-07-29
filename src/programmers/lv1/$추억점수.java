package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $추억점수 {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int[] answer = solution(name, yearning, photo);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> yearningMap = getYearningMap(name, yearning);

		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += yearningMap.getOrDefault(photo[i][j], 0);
			}
		}

		return answer;
	}

	private static Map<String, Integer> getYearningMap(String[] name, int[] yearning) {
		Map<String, Integer> yearningMap = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			yearningMap.put(name[i], yearning[i]);
		}

		return yearningMap;
	}

}
