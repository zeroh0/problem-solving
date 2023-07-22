package programmers.lv1;

public class $크기가작은부분문자열 {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		int answer = solution(t, p);
		System.out.println("answer = " + answer);
	}

	private static int solution(String t, String p) {
		int index = 0;
		int count = 0;

		// index 값에 따라 substring되어 감소되는 문자열의 길이와 substring의 range가 되는 문자열의 길이를 비교
		while (t.substring(index).length() >= p.length()) {
			String str = t.substring(index, p.length() + index);
			index++;
			if (Long.parseLong(str) <= Long.parseLong(p)) {
				count++;
			}
		}

		return count;
	}

}
