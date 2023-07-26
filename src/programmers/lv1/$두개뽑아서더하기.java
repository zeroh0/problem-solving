package programmers.lv1;

import java.util.*;

public class $두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		int[] answer1 = solution1(numbers);
		System.out.println("answer = " + Arrays.toString(answer1));
		int[] answer2 = solution2(numbers);
		System.out.println("answer2 = " + Arrays.toString(answer2));
	}

	public static int[] solution1(int[] numbers) {
		List<Integer> numberList = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i == j) continue;
				int value = numbers[i] + numbers[j];
				// 중복체크
				if (!isDuplicatedValue(numberList, value)) {
					numberList.add(value);
				}
			}
		}

		// List<Integer> -> int[]
		return convertListToArray(numberList);
	}

	public static int[] solution2(int[] numbers) {
		Set<Integer> numberSet = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i == j) continue;
				numberSet.add(numbers[i] + numbers[j]);
			}
		}

		// Set<Integer> -> int[]
		return convertSetToArray(numberSet);
	}

	private static boolean isDuplicatedValue(List<Integer> numberList, int value) {
		return numberList.stream()
				.anyMatch(num -> num == value);
	}

	private static int[] convertListToArray(List<Integer> numberList) {
		return numberList.stream()
				.sorted()
				.mapToInt(num -> num)
				.toArray();
	}

	private static int[] convertSetToArray(Set<Integer> numberSet) {
		return numberSet.stream()
				.sorted()
				.mapToInt(num -> num)
				.toArray();
	}

}
