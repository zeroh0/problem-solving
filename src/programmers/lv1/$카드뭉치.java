package programmers.lv1;

public class $카드뭉치 {

	public static void main(String[] args) {
		String[] card1 = {"i", "water", "drink"};
		String[] card2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		String answer = solution(card1, card2, goal);
		System.out.println("answer = " + answer);
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		int card1Idx = 0;
		int card2Idx = 0;

		for (int i = 0; i < goal.length; i++) {
			if (goal[i].equals(cards1[card1Idx])) {
				card1Idx = increaseIndex(cards1, card1Idx);
			} else if (goal[i].equals(cards2[card2Idx])) {
				card2Idx = increaseIndex(cards2, card2Idx);
			} else {
				return "No";
			}
		}
		return "Yes";
	}

	private static int increaseIndex(String[] cards2, int card2Idx) {
		if (cards2.length - 1 > card2Idx) {
			card2Idx++;
		}

		return card2Idx;
	}

}
