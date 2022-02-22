class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int length = arr.length;
        
        int answer = 0;
        
        for(int i = 0; i < length - 2; i++) {
            for(int j = i + 1; j < length - 1; j++) {
                for(int k = j + 1; k < length; k++) {
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        answer += 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
