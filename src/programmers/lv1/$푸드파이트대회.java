package programmers.lv1;

public class $푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		String answer = solution(food);
		System.out.println("answer = " + answer);
	}

	public static String solution(int[] food) {
		StringBuilder sb = new StringBuilder();

		// 수웅이가 먹을 음식의 개수 배열
		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i] / 2; j++) {
				sb.append(i);
			}
		}

		// 상대방이 먹을 음식의 개수 배열회
		StringBuilder reverse = new StringBuilder(sb).reverse();

		// 물
		sb.append(0);
		sb.append(reverse);

		return String.valueOf(sb);
	}

}
