package programmers.lv1;

public class $콜라문제 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int n = 20;
		int answer = solution(a, b, n);
		System.out.println("answer = " + answer);
	}

	/**
	 * 콜라문제
	 * @param a 콜라는 받기 위해 마트에 주어야 하는 병 수
	 * @param b 빈병 a를 가져다 주면 마트가 주는 콜라 병 수
	 * @param n 상빈이가 가지고 있는 빈 병의 개수
	 * @return 상빈이가 받을 수 있는 콜라의 병 수
	 */
	public static int solution(int a, int b, int n) {
		int emptyBottle = n;
		int coke = 0;

		while (emptyBottle >= a) {
			coke += emptyBottle / a * b;
			emptyBottle = (emptyBottle / a * b) + (emptyBottle % a);
		}

		return coke;
	}

}
