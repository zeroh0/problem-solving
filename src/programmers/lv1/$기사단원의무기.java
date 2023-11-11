package programmers.lv1;

public class $기사단원의무기 {

    public static void main(String[] args) {
        int answer = solution(10, 3, 2);
        System.out.println(answer);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisorsCount = getDivisorsCount(i);
            if (divisorsCount > limit) {
                answer += power;
            } else {
                answer += divisorsCount;
            }
        }

        return answer;
    }

    /**
     * 약수의 갯수 구하기
     * @param n
     * @return
     */
    private static int getDivisorsCount(int n) {
        int count = 0;

        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }

        return count;
    }

}
