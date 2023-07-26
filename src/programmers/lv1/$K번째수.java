package programmers.lv1;

import java.util.Arrays;

public class $K번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
		System.out.println("answer = " + Arrays.toString(answer));
	}

	private static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 배열 자르기
			int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			selectionSort(arr);
			answer[i] = arr[commands[i][2] - 1];
		}

		return answer;
	}

	// 선택정렬
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
	}

}
