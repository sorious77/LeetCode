class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int answer = arr[0];
        int length = arr.length;
        int[] sum = new int[length];

        sum[0] = arr[0];
        for (int i = 1; i < length; i++) {
            sum[i] = sum[i - 1] + arr[i];
            answer += arr[i];
        }

        for (int size = 3; size <= length; size += 2) {
            for (int i = 0; i + size <= length; i++) {
                answer += (sum[i + size - 1] - sum[i] + arr[i]);
            }
        }

        return answer;
    }
}
