package programmers.lv1;

public class $예산 {

	public static void main(String[] args) {
		int budget = 10;
		int[] d = {2, 2, 3, 3};
		int answer = solution(d, budget);
		System.out.println("answer = " + answer);
	}

	private static int solution(int[] d, int budget) {
		bubbleSort(d);

		int sum = 0;
		int count = 0;

		for (int subsidy : d) {
			sum += subsidy;
			if (sum <= budget) {
				count++;
			}
		}

		return count;
	}

	// 버블정렬
	private static void bubbleSort(int[] d) {
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] > d[j]) {
					int tmp = d[i];
					d[i] = d[j];
					d[j] = tmp;
				}
			}
		}
	}

}
