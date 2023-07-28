package programmers.lv1;

import java.util.Arrays;

public class $가장가까운같은글자 {

	public static void main(String[] args) {
		String s = "banana";
		int[] answer = solution(s);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];

		for (int i = 0; i <= s.length() - 1; i++) {
			int index = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (s.charAt(j) == s.charAt(i)) {
					index = i - j;
					break;
				}
			}
			answer[i] = index;
		}

		return answer;
	}

}
