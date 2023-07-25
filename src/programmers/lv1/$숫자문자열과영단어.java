package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class $숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "one4seveneight";
		int answer = solution(s);
		System.out.println("answer = " + answer);
	}

	private static int solution(String s) {
		Map<String, Integer> englishNumberMap = getEnglishNumberMap();
		String englishNumber = s;
		for (String key : englishNumberMap.keySet()) {
			englishNumber = englishNumber.replaceAll(key, String.valueOf(englishNumberMap.get(key)));
		}

		return Integer.parseInt(englishNumber);
	}

	private static Map<String, Integer> getEnglishNumberMap() {
		Map<String, Integer> englishNumberMap = new HashMap<>();
		englishNumberMap.put("zero", 0);
		englishNumberMap.put("one", 1);
		englishNumberMap.put("two", 2);
		englishNumberMap.put("three", 3);
		englishNumberMap.put("four", 4);
		englishNumberMap.put("five", 5);
		englishNumberMap.put("six", 6);
		englishNumberMap.put("seven", 7);
		englishNumberMap.put("eight", 8);
		englishNumberMap.put("nine", 9);

		return englishNumberMap;
	}

}
