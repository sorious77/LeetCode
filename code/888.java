class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        boolean[] bobCandy = new boolean[100001];

        int alice = Arrays.stream(aliceSizes).sum();
        int bob = Arrays.stream(bobSizes).peek(b -> bobCandy[b] = true).sum();

        int answer = Arrays.stream(aliceSizes).filter(a -> a - (alice - bob) / 2 > 0 && a - (alice - bob) / 2 <= 100000).
            filter(a -> bobCandy[a - (alice - bob) / 2]).findFirst().getAsInt();

        return new int[]{answer, answer - (alice - bob) / 2};
    }
}