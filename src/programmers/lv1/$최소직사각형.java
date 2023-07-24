package programmers.lv1;

public class $최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int answer = solution(sizes);
		System.out.println("answer = " + answer);
	}

	private static int solution(int[][] sizes) {
		int width = 0;
		int height = 0;

		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < sizes[i].length - 1; j++) {
				// N행의 두 개의 숫자 중 큰 값과 작은 값을 가로 세로 길이와 비교해 지갑의 가로 세로 길이를 구한다.
				int max = Math.max(sizes[i][j], sizes[i][j + 1]);
				int min = Math.min(sizes[i][j], sizes[i][j + 1]);
				if (max > width) {
					width = max;
				}
				if (min > height) {
					height = min;
				}
			}
		}

		return width * height;
	}

}
