class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0];
        int sum = 0;
        int length = salary.length;

        for (int num : salary) {
            sum += num;

            if (min > num) {
                min = num;
            }

            if (max < num) {
                max = num;
            }
        }

        return (double) (sum - min - max) / (length - 2);
    }
}