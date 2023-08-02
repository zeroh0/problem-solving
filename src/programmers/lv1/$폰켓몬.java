package programmers.lv1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class $폰켓몬 {

	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 2};
		int answer = solution(nums);
		System.out.println("answer = " + answer);
	}

	public static int solution(int[] nums) {
		Set<Integer> integerSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		return Math.min(integerSet.size(), nums.length / 2);
	}

}
