public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 1, right = n;

        int answer = n;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (!isBadVersion((int) mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;

                if (!isBadVersion((int) mid - 1)) {
                    answer = (int) mid;
                    break;
                }
            }
        }

        return answer;
    }
}