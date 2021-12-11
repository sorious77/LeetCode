public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int answer = 0;

        while(true) {
            answer = left + (right - left) / 2;

            int result = guess(answer);

            if(result == 0) {
                break;
            } else if(result == -1) {
                right = answer - 1;
            } else {
                left = answer + 1;
            }
        }

        return answer;
    }
}