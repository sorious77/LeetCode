class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int []xor = new int[arr.length];
        int []answer = new int[queries.length];
        
        xor[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            xor[i] = arr[i] ^ xor[i - 1];
        }
        
        for(int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
            if(left == 0) {
                answer[i] = xor[right];
            } else {
                answer[i] = xor[right] ^ xor[left - 1];
            }
        }
        
        return answer;
    }
}